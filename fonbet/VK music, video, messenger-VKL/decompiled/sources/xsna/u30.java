package xsna;

import android.content.SharedPreferences;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vk.core.exceptions.DisposableException;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.mediastore.storage.ClipsVideoStorage;
import com.vk.newsfeed.impl.data.database.entity.action.SyncStatusEntity;
import com.vk.toggle.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptySet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class u30 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((v30) this.c).b().a.delete("actions_with_offline_support", "sync_status = ?", new String[]{SyncStatusEntity.SYNCED.h()});
                break;
            case 1:
                i5b i5bVar = (i5b) this.c;
                i5bVar.r.e = false;
                i5bVar.p = null;
                break;
            case 2:
                String str = (String) this.c;
                ClipsVideoStorage.a.getClass();
                j7q c = ClipsVideoStorage.c();
                if (c != null) {
                    c.f(str, null, MimeTypes.APPLICATION_MPD);
                }
                ClipsVideoStorage.g = null;
                break;
            case 3:
                i0q0.f((gzs) this.c);
                break;
            case 4:
                yp80 yp80Var = ((ur80) this.c).e;
                if (yp80Var != null) {
                    yp80Var.onError(new DisposableException());
                    break;
                }
                break;
            case 5:
                ((bqb0) this.c).i.d();
                break;
            case 6:
                NewsEntry newsEntry = (NewsEntry) this.c;
                newsEntry.d = true;
                qr.d(ce60.b, 101, newsEntry);
                break;
            case 7:
                ((oxl0) this.c).V0();
                break;
            default:
                d0r0 d0r0Var = (d0r0) this.c;
                for (b.d dVar : d0r0Var.a.v().b) {
                    String obj = dVar.b.toString();
                    boolean z = false;
                    try {
                        Pair pair = new Pair(d0r0Var.a.h.b(obj, false), d0r0Var.a.h.b(obj, true));
                        b.d dVar2 = (b.d) pair.d();
                        b.d dVar3 = (b.d) pair.g();
                        if (dVar2 != null && dVar3 != null) {
                            z = d0r0.b(dVar2, dVar3);
                        }
                    } catch (Exception unused) {
                    }
                    if (z) {
                        d0r0Var.a.h.k(dVar.b.toString(), true);
                        d0r0Var.a.i.a.remove(dVar.b.toString());
                    }
                }
                SharedPreferences a = d0r0Var.a();
                Set<String> set = EmptySet.b;
                Set<String> stringSet = a.getStringSet("cached_local_toggles_keys", set);
                if (stringSet != null) {
                    set = stringSet;
                }
                ArrayList arrayList = new ArrayList();
                for (String str2 : set) {
                    String string = d0r0Var.a().getString("cached_local_toggle_value_" + str2, null);
                    b.d a2 = string != null ? w0p0.a(str2, string) : null;
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b.d dVar4 = (b.d) it.next();
                    d0r0Var.a.h.e().a(dVar4, true);
                    d0r0Var.a.i.a.put(dVar4.b.toString(), dVar4);
                }
                d0r0Var.a().edit().clear().apply();
                break;
        }
    }
}
