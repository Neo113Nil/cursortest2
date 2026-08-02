package xsna;

import android.os.Bundle;
import com.vk.clips.reports.impl.ClipsReportFragment;
import com.vk.common.links.AwayLink;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.search.params.api.domain.model.education.EducationParam;
import java.util.List;
import kotlin.Pair;
import xsna.c8p;
import xsna.jw00;
import xsna.qjc;
import xsna.qy3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s7 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.b, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.g, qjc.a, pcs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.qjc.a
    public void I(AwayLink awayLink) {
        ((gzs) this.c).invoke();
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        jb5 jb5Var = (jb5) this.c;
        int i = ClipsReportFragment.V;
        jb5Var.invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (rjz) ((r7) obj2).invoke(obj);
            case 1:
                return (List) ((r7) obj2).invoke(obj);
            case 2:
                return (qy3.a) ((ya) obj2).invoke(obj);
            case 3:
                return (List) ((sm0) obj2).invoke(obj);
            case 4:
                return (hda) ((ee8) obj2).invoke(obj);
            case 5:
                return ((izs) obj2).invoke(obj);
            case 6:
                return (qih0) ((ee8) obj2).invoke(obj);
            case 7:
                return (xpe) ((xv2) obj2).invoke(obj);
            case 8:
            case 17:
            case 25:
            default:
                return (wav0) ((qey) obj2).invoke(obj);
            case 9:
                return (iag) ((j6e) obj2).invoke(obj);
            case 10:
                int i2 = CommunityProfileFragment.k0;
                return (io.reactivex.rxjava3.core.b0) ((j6e) obj2).invoke(obj);
            case 11:
                return (ayh) ((ya) obj2).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.b0) ((j6e) obj2).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.t) ((ya) obj2).invoke(obj);
            case 14:
                return (cts) ((sm0) obj2).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.t) ((sm0) obj2).invoke(obj);
            case 16:
                return (List) ((sm0) obj2).invoke(obj);
            case 18:
                return (s3q0) ((c2u) obj2).invoke(obj);
            case 19:
                return (jw00.b) ((c2u) obj2).invoke(obj);
            case 20:
                return (s3q0) ((r330) obj2).invoke(obj);
            case 21:
                return (Pair) ((c2u) obj2).invoke(obj);
            case 22:
                return (io.reactivex.rxjava3.core.t) ((r330) obj2).invoke(obj);
            case 23:
                return (ncq0) ((qey) obj2).invoke(obj);
            case 24:
                return (x960) ((c2u) obj2).invoke(obj);
            case 26:
                return (lu60) ((qey) obj2).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (t460) ((dji) this.c).invoke(obj, obj2, obj3);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        lv90 lv90Var = (lv90) this.c;
        c8p.n1.getClass();
        EducationParam a = c8p.b.a(bundle);
        zak0 zak0Var = (zak0) lv90Var.l1;
        VkPeopleSearchParams copy = ((VkPeopleSearchParams) zak0Var.getValue()).copy();
        copy.g = a;
        zak0Var.setValue(copy);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((sm0) this.c).invoke(obj)).booleanValue();
    }
}
