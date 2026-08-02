package xsna;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StoryViewActionButtonDelegate.kt */
/* loaded from: classes6.dex */
public final class skm0 {
    public final uvl0 a;

    /* compiled from: StoryViewActionButtonDelegate.kt */
    public interface a {
        void F();

        void F0();

        void J0();

        void M0();

        void O0();

        void c0(boolean z, boolean z2);

        void d();

        void e();

        void h();

        void i();

        void k();

        void l0();

        void m();

        void n();

        void o0();

        void p0();

        void q();

        void q0();

        void s();

        void u();

        void w();
    }

    /* compiled from: StoryViewActionButtonDelegate.kt */
    public static abstract class b {

        /* compiled from: StoryViewActionButtonDelegate.kt */
        public static abstract class a extends b {
            public final String a;

            /* compiled from: StoryViewActionButtonDelegate.kt */
            /* renamed from: xsna.skm0$b$a$a, reason: collision with other inner class name */
            public static final class C3670a extends a {
                public final String b;

                public C3670a(String str) {
                    super(str);
                    this.b = str;
                }

                @Override // xsna.skm0.b.a
                public final String a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3670a) && epx.f(this.b, ((C3670a) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("AdMarker(text="), this.b, ')');
                }
            }

            /* compiled from: StoryViewActionButtonDelegate.kt */
            /* renamed from: xsna.skm0$b$a$b, reason: collision with other inner class name */
            public static final class C3671b extends a {
                public final String b;

                public C3671b(String str) {
                    super(str);
                    this.b = str;
                }

                @Override // xsna.skm0.b.a
                public final String a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3671b) && epx.f(this.b, ((C3671b) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("CopyUrl(text="), this.b, ')');
                }
            }

            /* compiled from: StoryViewActionButtonDelegate.kt */
            public static final class c extends a {
                public final String b;

                public c(String str) {
                    super(str);
                    this.b = str;
                }

                @Override // xsna.skm0.b.a
                public final String a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("NotInteresting(text="), this.b, ')');
                }
            }

            /* compiled from: StoryViewActionButtonDelegate.kt */
            public static final class d extends a {
                public final String b;

                public d(String str) {
                    super(str);
                    this.b = str;
                }

                @Override // xsna.skm0.b.a
                public final String a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("RecommendationsInfo(text="), this.b, ')');
                }
            }

            /* compiled from: StoryViewActionButtonDelegate.kt */
            public static final class e extends a {
                public final String b;

                public e(String str) {
                    super(str);
                    this.b = str;
                }

                @Override // xsna.skm0.b.a
                public final String a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("Report(text="), this.b, ')');
                }
            }

            /* compiled from: StoryViewActionButtonDelegate.kt */
            public static final class f extends a {
                public final String b;

                public f(String str) {
                    super(str);
                    this.b = str;
                }

                @Override // xsna.skm0.b.a
                public final String a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("Settings(text="), this.b, ')');
                }
            }

            /* compiled from: StoryViewActionButtonDelegate.kt */
            public static final class g extends a {
                public final String b;

                public g(String str) {
                    super(str);
                    this.b = str;
                }

                @Override // xsna.skm0.b.a
                public final String a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("ShowAdvertiserInfo(text="), this.b, ')');
                }
            }

            public a(String str) {
                this.a = str;
            }

            public String a() {
                return this.a;
            }
        }

        /* compiled from: StoryViewActionButtonDelegate.kt */
        /* renamed from: xsna.skm0$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC3672b extends b {
            public final String a;

            /* compiled from: StoryViewActionButtonDelegate.kt */
            /* renamed from: xsna.skm0$b$b$a */
            public static final class a extends AbstractC3672b {
                public final String b;

                public a(String str) {
                    super(str);
                    this.b = str;
                }

                @Override // xsna.skm0.b.AbstractC3672b
                public final String a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("Disclaimer(text="), this.b, ')');
                }
            }

            public AbstractC3672b(String str) {
                this.a = str;
            }

            public String a() {
                return this.a;
            }
        }
    }

    /* compiled from: StoryViewActionButtonDelegate.kt */
    public static final class c extends BaseAdapter {
        public final ContextThemeWrapper b;
        public final List<b> c;

        public c(ContextThemeWrapper contextThemeWrapper, List list) {
            this.b = contextThemeWrapper;
            this.c = list;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return this.c.size();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            return this.c.get(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(this.b).inflate(R.layout.pds_story_actions_item, viewGroup, false);
            }
            b bVar = this.c.get(i);
            TextView textView = (TextView) view.findViewById(R.id.tv_title);
            TextView textView2 = (TextView) view.findViewById(R.id.tv_description);
            if (bVar instanceof b.a) {
                bwt0.p0(textView, true);
                bwt0.p0(textView2, false);
                textView.setText(((b.a) bVar).a());
                return view;
            }
            if (!(bVar instanceof b.AbstractC3672b)) {
                throw new NoWhenBranchMatchedException();
            }
            bwt0.p0(textView, false);
            bwt0.p0(textView2, true);
            textView2.setText(((b.AbstractC3672b) bVar).a());
            return view;
        }
    }

    public skm0(uvl0 uvl0Var) {
        this.a = uvl0Var;
    }
}
