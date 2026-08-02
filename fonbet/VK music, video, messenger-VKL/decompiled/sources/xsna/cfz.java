package xsna;

import android.view.View;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.media.pipeline.utils.concurrent.ThreadStuckAnalyzer;
import java.io.File;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import ru.ok.android.webrtc.topology.direct.P2PNetworkStatusReporter;
import ru.rustore.sdk.activitylauncher.a;
import ru.rustore.sdk.appupdate.errors.RuStoreInstallException;
import xsna.bfz;
import xsna.bzp0;
import xsna.dug0;
import xsna.mov0;
import xsna.ngl;
import xsna.tmq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class cfz implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.a0, ngl.a, ThreadStuckAnalyzer.a, zm, io.reactivex.rxjava3.functions.m, yads.zk2, qa80 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cfz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zm
    public boolean a(View view) {
        ((com.vk.writebar.a) this.c).l.performClick();
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (bfz.a) ((qcl) obj2).invoke(obj);
            case 1:
                int i2 = MarketEditAlbumGoodsFragment.c1;
                return (io.reactivex.rxjava3.core.t) ((zf1) obj2).invoke(obj);
            case 2:
                File file = (File) obj2;
                dug0.c cVar = (dug0.c) obj;
                boolean c = cVar.c();
                File file2 = cVar.c;
                if (!c) {
                    return cVar;
                }
                com.vk.core.files.a.M(file, file2, true);
                vhk0.b(file2);
                return dug0.c.a(file);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((y8m) obj2).invoke(obj);
            case 4:
                return (List) ((y8m) obj2).invoke(obj);
            case 5:
                return (io.reactivex.rxjava3.core.t) ((ux40) obj2).invoke(obj);
            case 6:
                return (Playlist) ((uw4) obj2).invoke(obj);
            case 7:
            case 8:
            case 10:
            case 20:
            case 21:
            default:
                return (io.reactivex.rxjava3.core.t) ((x43) obj2).invoke(obj);
            case 9:
                return (ncq0) ((y8m) obj2).invoke(obj);
            case 11:
                return (VKList) ((or50) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.t) ((o83) obj2).invoke(obj);
            case 13:
                return (ate0) ((zsl0) obj2).invoke(obj);
            case 14:
                return (Set) ((h2h0) obj2).invoke(obj);
            case 15:
                return ((tmq0.a) obj2).invoke(obj);
            case 16:
                return (List) ((eyp0) obj2).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.t) ((lyl0) obj2).invoke(obj);
            case 18:
                return (hda) ((y9s0) obj2).invoke(obj);
            case 19:
                return (Optional) ((h2h0) obj2).invoke(obj);
            case 22:
                return ((mov0.a) obj2).invoke(obj);
        }
    }

    @Override // com.vk.media.pipeline.utils.concurrent.ThreadStuckAnalyzer.a
    public void b(ThreadStuckAnalyzer.ThreadStuckException threadStuckException) {
        chd0 chd0Var;
        mwa0 mwa0Var = (mwa0) this.c;
        if (mwa0Var.j != null) {
            chd0 chd0Var2 = mwa0Var.h;
            w3t0 w3t0Var = mwa0Var.j;
            if (w3t0Var == null) {
                w3t0Var = null;
            }
            chd0Var = chd0.a(chd0Var2, null, null, Integer.valueOf(w3t0Var.g), 7);
        } else {
            chd0Var = mwa0Var.h;
        }
        xu10 xu10Var = mwa0Var.d;
        if (xu10Var != null) {
            xu10Var.a(new n690(threadStuckException, chd0Var));
        }
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        im90 im90Var = (im90) this.c;
        wz2 wz2Var = cVar.b;
        cfv0 cfv0Var = wz2Var instanceof cfv0 ? (cfv0) wz2Var : null;
        if (cfv0Var == null) {
            return;
        }
        im90Var.b.Pf(Integer.valueOf(cfv0Var.d), new xjq(new Throwable()));
    }

    @Override // xsna.qa80
    public void g(ru.rustore.sdk.activitylauncher.a aVar) {
        vtj0 vtj0Var = (vtj0) this.c;
        if (aVar instanceof a.d ? true : aVar.equals(a.e.b) ? true : aVar.equals(a.f.b) ? true : aVar.equals(a.C2395a.b)) {
            vtj0Var.a(new RuStoreInstallException(aVar.a()));
            return;
        }
        if (aVar.equals(a.b.b) ? true : aVar.equals(a.c.b)) {
            vtj0Var.b(Integer.valueOf(aVar.a()));
        }
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        P2PNetworkStatusReporter.a((P2PNetworkStatusReporter) this.c, yVar);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((lyl0) this.c).invoke(obj)).booleanValue();
    }
}
