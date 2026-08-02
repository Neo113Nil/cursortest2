package xsna;

import android.view.View;
import android.view.ViewParent;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: ViewCompositionStrategy.android.kt */
/* loaded from: classes11.dex */
public interface mut0 {
    gzs<s3q0> a(td tdVar);

    /* compiled from: ViewCompositionStrategy.android.kt */
    public static final class a implements mut0 {
        public static final a a = new a();

        /* compiled from: ViewCompositionStrategy.android.kt */
        /* renamed from: xsna.mut0$a$a, reason: collision with other inner class name */
        public static final class C3371a extends Lambda implements gzs<s3q0> {
            final /* synthetic */ b $listener;
            final /* synthetic */ td $view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3371a(td tdVar, b bVar) {
                super(0);
                this.$view = tdVar;
                this.$listener = bVar;
            }

            @Override // xsna.gzs
            public final s3q0 invoke() {
                this.$view.removeOnAttachStateChangeListener(this.$listener);
                return s3q0.a;
            }
        }

        @Override // xsna.mut0
        public final gzs<s3q0> a(td tdVar) {
            b bVar = new b(tdVar);
            tdVar.addOnAttachStateChangeListener(bVar);
            return new C3371a(tdVar, bVar);
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        public static final class b implements View.OnAttachStateChangeListener {
            public final /* synthetic */ td b;

            public b(td tdVar) {
                this.b = tdVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                this.b.s();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
            }
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    public static final class b implements mut0 {
        public static final b a = new b();

        /* compiled from: ViewCompositionStrategy.android.kt */
        public static final class a extends Lambda implements gzs<s3q0> {
            final /* synthetic */ ViewOnAttachStateChangeListenerC3372b $listener;
            final /* synthetic */ qvb0 $poolingContainerListener;
            final /* synthetic */ td $view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(td tdVar, ViewOnAttachStateChangeListenerC3372b viewOnAttachStateChangeListenerC3372b, nut0 nut0Var) {
                super(0);
                this.$view = tdVar;
                this.$listener = viewOnAttachStateChangeListenerC3372b;
                this.$poolingContainerListener = nut0Var;
            }

            @Override // xsna.gzs
            public final s3q0 invoke() {
                this.$view.removeOnAttachStateChangeListener(this.$listener);
                td tdVar = this.$view;
                g620.i(tdVar).a.remove(this.$poolingContainerListener);
                return s3q0.a;
            }
        }

        @Override // xsna.mut0
        public final gzs<s3q0> a(td tdVar) {
            ViewOnAttachStateChangeListenerC3372b viewOnAttachStateChangeListenerC3372b = new ViewOnAttachStateChangeListenerC3372b(tdVar);
            tdVar.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3372b);
            nut0 nut0Var = new nut0(tdVar);
            g620.i(tdVar).a(nut0Var);
            return new a(tdVar, viewOnAttachStateChangeListenerC3372b, nut0Var);
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        /* renamed from: xsna.mut0$b$b, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC3372b implements View.OnAttachStateChangeListener {
            public final /* synthetic */ td b;

            public ViewOnAttachStateChangeListenerC3372b(td tdVar) {
                this.b = tdVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                boolean z;
                td tdVar = this.b;
                Iterator it = dli0.e(tdVar.getParent(), eyt0.b).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object obj = (ViewParent) it.next();
                    if (obj instanceof View) {
                        Object tag = ((View) obj).getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            z = true;
                            break;
                        }
                    }
                }
                if (z) {
                    return;
                }
                tdVar.s();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
            }
        }
    }

    /* compiled from: ViewCompositionStrategy.android.kt */
    public static final class c implements mut0 {
        public static final c a = new c();

        /* compiled from: ViewCompositionStrategy.android.kt */
        public static final class a extends Lambda implements gzs<s3q0> {
            final /* synthetic */ ViewOnAttachStateChangeListenerC3373c $listener;
            final /* synthetic */ td $view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(td tdVar, ViewOnAttachStateChangeListenerC3373c viewOnAttachStateChangeListenerC3373c) {
                super(0);
                this.$view = tdVar;
                this.$listener = viewOnAttachStateChangeListenerC3373c;
            }

            @Override // xsna.gzs
            public final s3q0 invoke() {
                this.$view.removeOnAttachStateChangeListener(this.$listener);
                return s3q0.a;
            }
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        public static final class b extends Lambda implements gzs<s3q0> {
            final /* synthetic */ Ref$ObjectRef<gzs<s3q0>> $disposer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Ref$ObjectRef<gzs<s3q0>> ref$ObjectRef) {
                super(0);
                this.$disposer = ref$ObjectRef;
            }

            @Override // xsna.gzs
            public final s3q0 invoke() {
                this.$disposer.element.invoke();
                return s3q0.a;
            }
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [T, xsna.mut0$c$a] */
        @Override // xsna.mut0
        public final gzs<s3q0> a(td tdVar) {
            if (!tdVar.isAttachedToWindow()) {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ViewOnAttachStateChangeListenerC3373c viewOnAttachStateChangeListenerC3373c = new ViewOnAttachStateChangeListenerC3373c(tdVar, ref$ObjectRef);
                tdVar.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3373c);
                ref$ObjectRef.element = new a(tdVar, viewOnAttachStateChangeListenerC3373c);
                return new b(ref$ObjectRef);
            }
            f5z e = gqo.e(tdVar);
            if (e != null) {
                return qut0.a(tdVar, e.getLifecycle());
            }
            uzw.c("View tree for " + tdVar + " has no ViewTreeLifecycleOwner");
            throw new KotlinNothingValueException();
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        /* renamed from: xsna.mut0$c$c, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC3373c implements View.OnAttachStateChangeListener {
            public final /* synthetic */ td b;
            public final /* synthetic */ Ref$ObjectRef<gzs<s3q0>> c;

            public ViewOnAttachStateChangeListenerC3373c(td tdVar, Ref$ObjectRef<gzs<s3q0>> ref$ObjectRef) {
                this.b = tdVar;
                this.c = ref$ObjectRef;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [T, xsna.put0] */
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                td tdVar = this.b;
                f5z e = gqo.e(tdVar);
                if (e != null) {
                    this.c.element = qut0.a(tdVar, e.getLifecycle());
                    tdVar.removeOnAttachStateChangeListener(this);
                } else {
                    uzw.c("View tree for " + tdVar + " has no ViewTreeLifecycleOwner");
                    throw new KotlinNothingValueException();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
            }
        }
    }
}
