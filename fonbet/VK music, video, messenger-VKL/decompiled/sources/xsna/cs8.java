package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.feedback.ButtonsFeedback;
import com.vk.feed.core.models.feedback.Feedback;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.ShitAttachment;
import one.video.controls.view.FastSpeedHintView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class cs8 implements o7j {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cs8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.o7j
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        int i2 = 8;
        switch (i) {
            case 0:
                ds8 ds8Var = (ds8) obj2;
                ButtonsFeedback.Answer answer = (ButtonsFeedback.Answer) obj;
                NewsEntry q6 = ds8Var.q6();
                if (q6 != null) {
                    Feedback feedback = q6.g;
                    ButtonsFeedback buttonsFeedback = feedback instanceof ButtonsFeedback ? (ButtonsFeedback) feedback : null;
                    if (buttonsFeedback != null) {
                        String str = answer.b;
                        int i3 = 2;
                        int i4 = 3;
                        if (!(q6 instanceof Post)) {
                            if (!(q6 instanceof ShitAttachment)) {
                                ds8Var.U6(q6, buttonsFeedback, str);
                                break;
                            } else {
                                ShitAttachment shitAttachment = (ShitAttachment) q6;
                                u1c0 J0 = ds8Var.J0();
                                rsg0.y0(yfb.x(((y11) ds8Var.J.getValue()).a(Integer.valueOf(J0 != null ? J0.k : 0), shitAttachment.v, str)), null, null, 3).subscribe(new defpackage.n(new defpackage.m(i4, ds8Var, buttonsFeedback), 11), new bg1(new k8(i3, ds8Var, buttonsFeedback), i2));
                                break;
                            }
                        } else {
                            Post post = (Post) q6;
                            String str2 = buttonsFeedback.d;
                            if (str2 != null && str2.length() != 0) {
                                ds8Var.U6(post, buttonsFeedback, str);
                                break;
                            } else {
                                u1c0 J02 = ds8Var.J0();
                                io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(yfb.x(cz60.h((cz60) ds8Var.K.getValue(), post.m, Integer.valueOf(post.n), post.L.b, Integer.valueOf(J02 != null ? J02.k : 0), str, null, null, null, null, 480)), null, null, 3);
                                int i5 = 4;
                                y0.subscribe(new hz(new lh(i5, ds8Var, buttonsFeedback), i2), new jz(new a5(i3, ds8Var, buttonsFeedback), i5));
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                FastSpeedHintView fastSpeedHintView = (FastSpeedHintView) obj2;
                cmq cmqVar = (cmq) obj;
                int i6 = FastSpeedHintView.c;
                if (!cmqVar.b) {
                    fastSpeedHintView.setVisibility(cmqVar.a ? 0 : 8);
                    break;
                }
                break;
        }
    }
}
