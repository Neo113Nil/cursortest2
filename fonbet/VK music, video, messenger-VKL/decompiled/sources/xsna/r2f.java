package xsna;

import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.vk.clips.sdk.screens.feed.helpers.scroll.ScrollEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipsScrollHelper.kt */
/* loaded from: classes17.dex */
public final class r2f {
    public final nfh0 a;
    public final Object b;
    public v1b0 c;
    public uj0 d;
    public t1b0 e;
    public ef2 f;
    public final o93 g;
    public boolean h;
    public boolean i;
    public final Object j;
    public final Object k;
    public boolean l;

    /* compiled from: ClipsScrollHelper.kt */
    public final class a implements bfh0 {

        /* compiled from: ClipsScrollHelper.kt */
        /* renamed from: xsna.r2f$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3593a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ScrollEvent.values().length];
                try {
                    iArr[ScrollEvent.DRAGGING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ScrollEvent.IDLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ScrollEvent.SETTLING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a() {
        }

        @Override // xsna.bfh0
        public final void a(ScrollEvent scrollEvent, int i) {
            int i2 = C3593a.$EnumSwitchMapping$0[scrollEvent.ordinal()];
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (Math.abs(i) > 10) {
                r2f.this.i = i > 0;
            }
        }
    }

    /* compiled from: ClipsScrollHelper.kt */
    public static final class b {
        public final t1b0 a;
        public final ArrayList b;

        public b(t1b0 t1b0Var, ArrayList arrayList) {
            this.a = t1b0Var;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            t1b0 t1b0Var = this.a;
            return this.b.hashCode() + ((t1b0Var == null ? 0 : t1b0Var.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HoldersToPrepareAndRelease(holderToPrepare=");
            sb.append(this.a);
            sb.append(", releaseHolders=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
        }
    }

    /* compiled from: ClipsScrollHelper.kt */
    public final class c implements dfh0 {

        /* compiled from: ClipsScrollHelper.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ScrollEvent.values().length];
                try {
                    iArr[ScrollEvent.IDLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ScrollEvent.SETTLING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ScrollEvent.DRAGGING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public c() {
        }

        @Override // xsna.dfh0
        public final void a(ScrollEvent scrollEvent) {
            ScrollEvent scrollEvent2 = ScrollEvent.IDLE;
            r2f r2fVar = r2f.this;
            if (scrollEvent != scrollEvent2) {
                ef2 ef2Var = r2fVar.f;
                if (ef2Var != null) {
                    r2fVar.a().removeCallbacks(ef2Var);
                }
                r2fVar.f = null;
                r2fVar.a().removeCallbacks(r2fVar.g);
            }
            int i = a.$EnumSwitchMapping$0[scrollEvent.ordinal()];
            if (i == 1) {
                r2fVar.c(false);
                r2fVar.b();
            } else if (i == 2) {
                r2fVar.c(true);
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public r2f(nfh0 nfh0Var) {
        this.a = nfh0Var;
        i9 i9Var = new i9(15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, i9Var);
        this.g = new o93(this, 5);
        this.h = nfh0Var.b;
        this.i = true;
        int i = 29;
        this.j = msy.a(lazyThreadSafetyMode, new s5(this, i));
        this.k = msy.a(lazyThreadSafetyMode, new t5(this, i));
        this.l = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Handler a() {
        return (Handler) this.b.getValue();
    }

    public final void b() {
        boolean z;
        t1b0 t1b0Var;
        if (this.h) {
            return;
        }
        if (this.d == null) {
            Log.e("ClipsScrollHelper", "You must have forgotten to attach TargetPositionGetter");
            z = false;
        } else {
            z = true;
        }
        if (this.c == null) {
            Log.e("ClipsScrollHelper", "You must have forgotten to attach PlayerHoldersProvider");
            z = false;
        }
        if (z) {
            uj0 uj0Var = this.d;
            if (uj0Var == null) {
                throw new IllegalStateException("You must have forgotten to attach TargetPositionGetter");
            }
            q2f q2fVar = (q2f) uj0Var.b;
            q8e q8eVar = (q8e) uj0Var.c;
            int i = q2fVar.e;
            if (i == -1) {
                View findSnapView = q2fVar.b.b().findSnapView((LinearLayoutManager) q8eVar.getLayoutManager());
                i = findSnapView == null ? 0 : q8eVar.getChildLayoutPosition(findSnapView);
            }
            ArrayList arrayList = new ArrayList();
            boolean z2 = i == 0 || this.i;
            v1b0 v1b0Var = this.c;
            if (v1b0Var == null) {
                throw new IllegalStateException("You must have forgotten to attach PlayerHoldersProvider");
            }
            List<Integer> b2 = v1b0Var.b();
            if (z2) {
                int size = b2.size();
                t1b0Var = null;
                for (int i2 = 0; i2 < size; i2++) {
                    int intValue = b2.get(i2).intValue();
                    v1b0 v1b0Var2 = this.c;
                    if (v1b0Var2 == null) {
                        throw new IllegalStateException("You must have forgotten to attach PlayerHoldersProvider");
                    }
                    t1b0 a2 = v1b0Var2.a(intValue);
                    if (a2 != null) {
                        boolean z3 = (z2 && intValue > i) || (!z2 && intValue < i);
                        if (!a2.equals(this.e)) {
                            if (z3 && t1b0Var == null) {
                                t1b0Var = a2;
                            } else {
                                arrayList.add(a2);
                            }
                        }
                    }
                }
            } else {
                t1b0Var = null;
                for (int size2 = b2.size() - 1; -1 < size2; size2--) {
                    int intValue2 = b2.get(size2).intValue();
                    v1b0 v1b0Var3 = this.c;
                    if (v1b0Var3 == null) {
                        throw new IllegalStateException("You must have forgotten to attach PlayerHoldersProvider");
                    }
                    t1b0 a3 = v1b0Var3.a(intValue2);
                    if (a3 != null) {
                        boolean z4 = (z2 && intValue2 > i) || (!z2 && intValue2 < i);
                        if (!a3.equals(this.e)) {
                            if (z4 && t1b0Var == null) {
                                t1b0Var = a3;
                            } else {
                                arrayList.add(a3);
                            }
                        }
                    }
                }
            }
            ef2 ef2Var = new ef2(new b(this.a.a ? t1b0Var : null, arrayList), 5);
            ef2 ef2Var2 = this.f;
            if (ef2Var2 != null) {
                a().removeCallbacks(ef2Var2);
            }
            a().post(ef2Var);
            this.f = ef2Var;
        }
    }

    public final void c(boolean z) {
        boolean z2;
        t1b0 t1b0Var;
        o0f attachedPlayer;
        boolean hasCallbacks;
        o0f attachedPlayer2;
        o0f attachedPlayer3;
        o0f attachedPlayer4;
        if (this.h) {
            return;
        }
        if (this.d == null) {
            Log.e("ClipsScrollHelper", "You must have forgotten to attach TargetPositionGetter");
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.c == null) {
            Log.e("ClipsScrollHelper", "You must have forgotten to attach PlayerHoldersProvider");
            z2 = false;
        }
        if (z2) {
            uj0 uj0Var = this.d;
            if (uj0Var == null) {
                throw new IllegalStateException("You must have forgotten to attach TargetPositionGetter");
            }
            q2f q2fVar = (q2f) uj0Var.b;
            q8e q8eVar = (q8e) uj0Var.c;
            int i = q2fVar.e;
            if (i == -1) {
                View findSnapView = q2fVar.b.b().findSnapView((LinearLayoutManager) q8eVar.getLayoutManager());
                i = findSnapView == null ? 0 : q8eVar.getChildLayoutPosition(findSnapView);
            }
            v1b0 v1b0Var = this.c;
            if (v1b0Var == null) {
                throw new IllegalStateException("You must have forgotten to attach PlayerHoldersProvider");
            }
            t1b0 a2 = v1b0Var.a(i);
            if (!epx.f(a2, this.e)) {
                t1b0 t1b0Var2 = this.e;
                if (t1b0Var2 != null && (attachedPlayer4 = t1b0Var2.getAttachedPlayer()) != null) {
                    attachedPlayer4.pause();
                }
                this.e = a2;
            }
            boolean isPrepared = (a2 == null || (attachedPlayer3 = a2.getAttachedPlayer()) == null) ? false : attachedPlayer3.isPrepared();
            if (a2 == null) {
                return;
            }
            if (!z || isPrepared) {
                if (!isPrepared && this.l) {
                    this.l = false;
                    t1b0 t1b0Var3 = this.e;
                    if (t1b0Var3 == null || (attachedPlayer2 = t1b0Var3.getAttachedPlayer()) == null) {
                        return;
                    }
                    attachedPlayer2.f();
                    return;
                }
                if (isPrepared) {
                    if (!isPrepared || (t1b0Var = this.e) == null || (attachedPlayer = t1b0Var.getAttachedPlayer()) == null) {
                        return;
                    }
                    attachedPlayer.play();
                    return;
                }
                int i2 = Build.VERSION.SDK_INT;
                o93 o93Var = this.g;
                if (i2 < 29) {
                    a().removeCallbacks(o93Var);
                    a().post(o93Var);
                } else {
                    hasCallbacks = a().hasCallbacks(o93Var);
                    if (hasCallbacks) {
                        return;
                    }
                    a().post(o93Var);
                }
            }
        }
    }
}
