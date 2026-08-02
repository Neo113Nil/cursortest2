package xsna;

import com.vk.voip.ui.groupcalls.GroupCallViewModel;
import xsna.ga90;

/* compiled from: PageVisibilityProviderImpl.kt */
/* loaded from: classes7.dex */
public final class ha90 implements ga90 {
    public final GroupCallViewModel a;
    public final GroupCallViewModel.GroupCallViewMode b;
    public final io.reactivex.rxjava3.subjects.d<Integer> c = io.reactivex.rxjava3.subjects.d.O0(0);

    public ha90(GroupCallViewModel groupCallViewModel, GroupCallViewModel.GroupCallViewMode groupCallViewMode) {
        this.a = groupCallViewModel;
        this.b = groupCallViewMode;
    }

    @Override // xsna.ga90
    public final io.reactivex.rxjava3.core.q<ga90.a> a() {
        this.a.getClass();
        return io.reactivex.rxjava3.core.q.m(this.c, GroupCallViewModel.i(), new nb(new hq5(this, 13), 27));
    }
}
