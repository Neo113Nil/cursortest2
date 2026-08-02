package xsna;

import android.database.Cursor;
import android.os.Trace;
import com.vk.dto.common.Peer;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.photogallery.LocalGalleryProvider;
import java.util.ArrayList;
import java.util.List;
import xsna.dum0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ndm implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ndm(pdm pdmVar, int i, Peer peer) {
        this.d = pdmVar;
        this.c = i;
        this.e = peer;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                pdm pdmVar = (pdm) this.d;
                Peer peer = (Peer) this.e;
                dum0 k = pdmVar.k();
                k.getClass();
                dum0.a aVar = dum0.a.FLAG_AND;
                String key = aVar.getKey();
                dum0.a aVar2 = dum0.a.FLAG_XOR;
                Cursor b = k.b.b().b(k.a.a, new String[]{dum0.a.TYPE.getKey(), aVar.getKey(), aVar2.getKey()}, ho8.a(xe9.a("(", key, " != 0) AND (? & ", key, " = "), aVar2.getKey(), ')'), new Object[]{Integer.valueOf(this.c)});
                ArrayList arrayList = new ArrayList(b.getCount());
                Trace.beginSection(ndp0.f("Cursor.forEach"));
                try {
                    try {
                        if (b.moveToFirst()) {
                            while (!b.isAfterLast()) {
                                arrayList.add(fl3.E(b, dum0.a.TYPE.getKey()));
                                b.moveToNext();
                            }
                        }
                        Trace.endSection();
                        pdmVar.b.b().h(new dlb(pdmVar, peer, arrayList, 3));
                        return s3q0.a;
                    } finally {
                        b.close();
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            default:
                yz10 yz10Var = (yz10) this.d;
                LocalGalleryProvider localGalleryProvider = (LocalGalleryProvider) this.e;
                List<AlbumEntry> list = (List) obj;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                for (AlbumEntry albumEntry : list) {
                    arrayList2.add(yz10Var.e(localGalleryProvider.getMediaType(), albumEntry, 0, this.c).l(new tuz(new cqf(albumEntry, 29), 0)));
                }
                return io.reactivex.rxjava3.core.x.D(arrayList2, new lp0(new uuz(0), 26));
        }
    }

    public /* synthetic */ ndm(yz10 yz10Var, LocalGalleryProvider localGalleryProvider, int i) {
        this.d = yz10Var;
        this.e = localGalleryProvider;
        this.c = i;
    }
}
