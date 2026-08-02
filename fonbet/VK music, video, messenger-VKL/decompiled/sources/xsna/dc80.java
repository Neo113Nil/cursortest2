package xsna;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import xsna.jc80;

/* compiled from: OnSwipeTouchListener.java */
/* loaded from: classes17.dex */
public final class dc80 extends jc80 {
    public static final int m;
    public static final int n;
    public int h;
    public final int i;
    public final GestureDetector j;

    @NonNull
    public final a k;
    public b l;

    /* compiled from: OnSwipeTouchListener.java */
    public final class a extends oe {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            dc80 dc80Var = dc80.this;
            int i = dc80Var.i;
            try {
                float y = motionEvent2.getY() - motionEvent.getY();
                float x = motionEvent2.getX() - motionEvent.getX();
                if (Math.abs(x) > Math.abs(y)) {
                    if (Math.abs(x) > i) {
                        Math.abs(f);
                        return false;
                    }
                } else if (Math.abs(y) > i && Math.abs(f2) > 100.0f && motionEvent.getY() > dc80Var.h) {
                    if (y > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        b bVar = dc80Var.l;
                        if (bVar != null) {
                            return bVar.a();
                        }
                    } else {
                        b bVar2 = dc80Var.l;
                        if (bVar2 != null) {
                            return bVar2.b();
                        }
                    }
                }
                return false;
            } catch (Exception e) {
                L.g("error on swipe ", e);
                return false;
            }
        }
    }

    /* compiled from: OnSwipeTouchListener.java */
    public interface b {
        boolean a();

        boolean b();
    }

    static {
        float f = 88;
        m = iah0.a(f);
        n = iah0.a(f);
    }

    public dc80(Context context, com.vk.story.viewer.impl.presentation.stories.a aVar) {
        super(aVar);
        this.h = 0;
        this.i = n;
        a aVar2 = new a();
        this.k = aVar2;
        this.j = new GestureDetector(context, aVar2);
    }

    @Override // xsna.jc80, android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        L.A("OnSwipeTouchListener", "onTouch: " + motionEvent);
        super.onTouch(view, motionEvent);
        this.j.onTouchEvent(motionEvent);
        return true;
    }

    public dc80(Context context, int i, jc80.b bVar) {
        super(bVar);
        this.h = 0;
        this.i = i;
        a aVar = new a();
        this.k = aVar;
        this.j = new GestureDetector(context, aVar);
    }
}
