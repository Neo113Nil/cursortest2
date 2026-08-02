package xsna;

import android.os.SystemClock;
import com.vk.voip.feedback_gestures.GestureFeedback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import ru.ok.gl.tf.gestures.Figure;
import ru.ok.gl.tf.gestures.FiguresConsumer;
import ru.ok.tensorflow.entity.CompositeGesture;
import ru.ok.tensorflow.entity.Gesture;

/* compiled from: GesturesFeedbackProxy.kt */
/* loaded from: classes7.dex */
public final class dpt implements FiguresConsumer<Figure<? extends Object>> {
    public final nie a;

    /* compiled from: GesturesFeedbackProxy.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Gesture.values().length];
            try {
                iArr[Gesture.THUMB_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gesture.THUMB_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gesture.PALM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Gesture.ROCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Gesture.VICTORY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CompositeGesture.values().length];
            try {
                iArr2[CompositeGesture.HEART.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public dpt(nie nieVar) {
        this.a = nieVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.collections.EmptyList] */
    @Override // ru.ok.gl.tf.gestures.FiguresConsumer
    public final void accept(Collection<? extends Figure<? extends Object>> collection) {
        ?? r2;
        boolean z;
        ?? r11;
        if (collection != null) {
            Collection<? extends Figure<? extends Object>> collection2 = collection;
            ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Figure) it.next()).getGesture());
            }
            r2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (next instanceof CompositeGesture) {
                    r2.add(next);
                }
            }
        } else {
            r2 = 0;
        }
        if (r2 == 0) {
            r2 = EmptyList.b;
        }
        Iterable iterable = (Iterable) r2;
        ArrayList arrayList2 = new ArrayList(c5g.u(iterable, 10));
        Iterator it3 = iterable.iterator();
        while (true) {
            z = true;
            if (!it3.hasNext()) {
                break;
            } else {
                arrayList2.add(a.$EnumSwitchMapping$1[((CompositeGesture) it3.next()).ordinal()] == 1 ? GestureFeedback.HEART : null);
            }
        }
        if (collection != null) {
            Collection<? extends Figure<? extends Object>> collection3 = collection;
            ArrayList arrayList3 = new ArrayList(c5g.u(collection3, 10));
            Iterator it4 = collection3.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((Figure) it4.next()).getGesture());
            }
            r11 = new ArrayList();
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Object next2 = it5.next();
                if (next2 instanceof Gesture) {
                    r11.add(next2);
                }
            }
        } else {
            r11 = 0;
        }
        if (r11 == 0) {
            r11 = EmptyList.b;
        }
        Iterable iterable2 = (Iterable) r11;
        ArrayList arrayList4 = new ArrayList(c5g.u(iterable2, 10));
        Iterator it6 = iterable2.iterator();
        while (it6.hasNext()) {
            int i = a.$EnumSwitchMapping$0[((Gesture) it6.next()).ordinal()];
            arrayList4.add(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : GestureFeedback.VICTORY : GestureFeedback.ROCK : GestureFeedback.PALM : GestureFeedback.DISLIKE : GestureFeedback.LIKE);
        }
        GestureFeedback gestureFeedback = (GestureFeedback) j5g.a0(j5g.V(j5g.u0(arrayList2, arrayList4)));
        if (gestureFeedback != null) {
            nie nieVar = this.a;
            ayo0 ayo0Var = (ayo0) nieVar.c;
            ayo0Var.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = ayo0Var.b;
            if (j != 0 && elapsedRealtime - j <= ayo0Var.a) {
                z = false;
            }
            if (z) {
                ayo0Var.b = elapsedRealtime;
            }
            if (z) {
                ((zos) nieVar.b).invoke(gestureFeedback.h());
            }
        }
    }
}
