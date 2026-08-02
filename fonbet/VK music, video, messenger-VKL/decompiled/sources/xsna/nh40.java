package xsna;

import com.vk.attachpicker.stickers.post.attach.StoryAttachImageView;
import com.vk.common.links.AwayLink;
import com.vk.newsfeed.impl.feedlikes.a;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.voip.ui.broadcast.fragments.info.StreamInfoFragment;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.o4e0;
import xsna.p250;
import xsna.w6w0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh40 implements io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.b, saz, a.InterfaceC1381a, zuq0, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.g, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nh40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.zuq0
    public void B(com.vk.profile.user.impl.ui.f fVar) {
        Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
        int i = UserProfileFragment.p0;
        ((fpq0) ref$ObjectRef.element).B(fVar);
    }

    @Override // xsna.saz
    public void I(AwayLink awayLink) {
        y5e0 y5e0Var = (y5e0) this.c;
        p250.b bVar = y5e0Var.c;
        int i = y5e0Var.d;
        String str = awayLink != null ? awayLink.b : null;
        if (str == null) {
            str = "";
        }
        bVar.invoke(new o4e0.c(i, str, awayLink != null ? awayLink.c : null, false));
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((qw6) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Pair) ((g6g) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (w6w0.a) ((odi) this.c).invoke(obj, obj2, obj3);
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.nf2) obj).onPlaybackSuppressionReasonChanged(((yads.df2) this.c).m);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ((Boolean) ((wik) obj2).invoke(obj)).booleanValue();
            case 1:
            default:
                int i2 = StreamInfoFragment.S;
                return ((Boolean) ((gxj0) obj2).invoke(obj)).booleanValue();
            case 2:
                return ((Boolean) ((c4r) obj2).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 17:
                int i2 = StoryAttachImageView.t;
                break;
        }
        return (Boolean) ((gxj0) obj2).invoke(obj);
    }
}
