package xsna;

import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.Collections;
import java.util.List;
import xsna.l6c0;
import xsna.r1r0;
import xsna.xqu;

/* compiled from: PostPagingMviTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class m6c0 implements izs {
    public final /* synthetic */ l6c0 b;

    public m6c0(l6c0 l6c0Var) {
        this.b = l6c0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.core.x b;
        io.reactivex.rxjava3.core.x l;
        io.reactivex.rxjava3.core.x l2;
        String str;
        Parcelable parcelable = (NewsEntry) j5g.b0(0, (List) obj);
        if (parcelable == null) {
            throw new IllegalArgumentException("listEntries must not be empty");
        }
        if (!(parcelable instanceof wee0)) {
            return io.reactivex.rxjava3.core.x.k(parcelable);
        }
        Owner G = ((wee0) parcelable).G();
        if (G == null) {
            io.reactivex.rxjava3.core.x.k(null);
            throw null;
        }
        if (fkq0.c(G.b)) {
            String str2 = G.c;
            if (str2 == null || drm0.N(str2) || (str = G.e) == null || drm0.N(str)) {
                boolean d = fkq0.d(G.b);
                int i = 17;
                l6c0 l6c0Var = this.b;
                if (d) {
                    b = rsg0.W(yfb.x(r1r0.a.b(l6c0Var.k, Collections.singletonList(G.b), Collections.singletonList(UsersFieldsDto.PHOTO_BASE), null, null, 58)), 7).l(new qu50(new w620(l6c0Var, i), 6));
                } else if (fkq0.b(G.b)) {
                    t6g0 t6g0Var = t6g0.b;
                    Group C0 = t6g0.b().C0(fkq0.a(G.b));
                    if (C0 != null) {
                        l = io.reactivex.rxjava3.core.x.k(C0);
                    } else {
                        List singletonList = Collections.singletonList(fkq0.a(G.b));
                        List l3 = e43.l(GroupsFieldsDto.NAME, GroupsFieldsDto.PHOTO_BASE);
                        if ((4 & 2) != 0) {
                            l3 = null;
                        }
                        l = rsg0.W(yfb.x(xqu.a.a(null, singletonList, l3)), 7).l(new z8(new lxz(l6c0Var, 20), 26));
                    }
                    b = l.l(new k6c0(new sux(14), 0));
                } else {
                    b = sn.b("Publisher is not group or user");
                }
                l2 = b.l(new d9(new e810(G, i), 29));
            } else {
                l2 = io.reactivex.rxjava3.core.x.k(G);
            }
        } else {
            com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Publisher userId isn't real: " + G.b));
            l2 = io.reactivex.rxjava3.core.x.k(G);
        }
        return l2.l(new l6c0.b(new t440(parcelable, 12)));
    }
}
