package xsna;

import android.graphics.RectF;
import com.vk.editor.timeline.entity.Animation;
import java.util.List;

/* compiled from: BaseTimelineItem.kt */
/* loaded from: classes18.dex */
public interface gp6 {

    /* compiled from: BaseTimelineItem.kt */
    public static final class a {
        public static y3o0 a(gp6 gp6Var) {
            return new y3o0(gp6Var.m(), gp6Var.getType());
        }
    }

    void A(Animation animation);

    RectF B();

    Animation C();

    y3o0 D();

    long E();

    void F(long j);

    long G();

    long H();

    float I();

    boolean J();

    boolean K();

    void L(float f);

    long getDuration();

    String getType();

    String m();

    void n(float f);

    void o(float f);

    float p();

    float q();

    long r();

    void s(long j);

    int t();

    RectF u();

    List<las> v();

    long w();

    long x();

    boolean y();

    void z(long j);
}
