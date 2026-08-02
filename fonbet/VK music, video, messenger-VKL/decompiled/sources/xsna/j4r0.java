package xsna;

import android.content.Context;
import com.vk.dto.uxpolls.PollQuestion;
import com.vk.video.growth.api.data.VideoGrowthType;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import com.vk.video.polls.ui.questions.grade.PollGradeView;
import com.vk.video.polls.ui.questions.open.PollOpenView;
import java.util.HashMap;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: UxPollViewBuilderImpl.kt */
/* loaded from: classes6.dex */
public final class j4r0 implements qos0 {
    public final Object a;
    public Object b;
    public Object c;

    public j4r0() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
    }

    @Override // xsna.qos0
    public void a() {
        ((ros0) this.c).d.show(((zos0) this.b).b);
    }

    @Override // xsna.qos0
    public void b() {
        ((ros0) this.c).d.d(((zos0) this.b).b);
        ((d0s) this.a).a();
    }

    @Override // xsna.qos0
    public void c() {
        d0s d0sVar = (d0s) this.a;
        ros0 ros0Var = ((yos0) d0sVar.a).d;
        Context context = (Context) d0sVar.b;
        VideoGrowthVideoParams videoGrowthVideoParams = (VideoGrowthVideoParams) d0sVar.c;
        zos0 a = ros0Var.a.a(VideoGrowthType.BOTTOM_SHEET);
        if (a == null) {
            return;
        }
        ros0Var.b.b(context, a.b, a.a, videoGrowthVideoParams, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    public ype0 d(zpe0 zpe0Var) {
        ype0 ype0Var;
        PollQuestion pollQuestion = (PollQuestion) this.a;
        Context context = (Context) this.b;
        if (context == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (pollQuestion instanceof PollQuestion.RatingStar) {
            ype0Var = new drb0(context);
        } else if (pollQuestion instanceof PollQuestion.Open) {
            ype0Var = new PollOpenView(context, null, 0, 14, 0);
        } else if (pollQuestion instanceof PollQuestion.Chips) {
            ype0Var = new fnb0(context);
        } else {
            if (!(pollQuestion instanceof PollQuestion.Grade)) {
                throw new NotImplementedError();
            }
            ype0Var = new PollGradeView(context, null, 0, 14, 0);
        }
        ?? r3 = (FunctionReferenceImpl) this.c;
        if (r3 == 0) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ype0Var.a4(pollQuestion, zpe0Var, r3);
        return ype0Var;
    }

    public void e(int i, String str, String str2) {
        ((HashMap) this.a).put(str, str2);
        ((HashMap) this.b).put(str2, str);
        ((HashMap) this.c).put(str, Integer.valueOf(i));
    }

    @Override // xsna.qos0
    public void onCancel() {
        ((ros0) this.c).d.b(((zos0) this.b).b);
        ((d0s) this.a).a();
    }

    public j4r0(PollQuestion pollQuestion) {
        this.a = pollQuestion;
    }

    public j4r0(d0s d0sVar, zos0 zos0Var, ros0 ros0Var) {
        this.a = d0sVar;
        this.b = zos0Var;
        this.c = ros0Var;
    }
}
