package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: VkCaptionView.kt */
/* loaded from: classes18.dex */
public final class lhu0 extends FrameLayout {
    public final View b;
    public final VkImageSimple c;
    public final VkLinkedText d;
    public final VkText e;
    public final View f;
    public final View g;
    public final View h;
    public a i;
    public b j;
    public c k;
    public boolean l;

    /* compiled from: VkCaptionView.kt */
    public interface a {

        /* compiled from: VkCaptionView.kt */
        /* renamed from: xsna.lhu0$a$a, reason: collision with other inner class name */
        public static final class C3268a implements a {
            public final gko a;

            public C3268a(gko gkoVar) {
                this.a = gkoVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3268a) && this.a.equals(((C3268a) obj).a);
            }

            public final int hashCode() {
                return Integer.hashCode(this.a.a);
            }

            public final String toString() {
                return "Icon(source=" + this.a + ')';
            }
        }
    }

    /* compiled from: VkCaptionView.kt */
    public interface b {

        /* compiled from: VkCaptionView.kt */
        public static final class a implements b {
            public final tlo0.h a;

            public a(tlo0.h hVar) {
                this.a = hVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a.equals(((a) obj).a);
            }

            public final int hashCode() {
                return this.a.a.hashCode();
            }

            public final String toString() {
                return jq.c(new StringBuilder("Text(text="), this.a, ')');
            }
        }
    }

    /* compiled from: VkCaptionView.kt */
    public interface c {

        /* compiled from: VkCaptionView.kt */
        public static final class a implements c {
            public final tlo0.h a;
            public final tr9 b;

            public a(tlo0.h hVar, tr9 tr9Var) {
                this.a = hVar;
                this.b = tr9Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && this.b.equals(aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.a.hashCode() * 31);
            }

            public final String toString() {
                return "ActionButton(text=" + this.a + ", onClick=" + this.b + ')';
            }
        }

        /* compiled from: VkCaptionView.kt */
        public static final class b implements c {
        }

        /* compiled from: VkCaptionView.kt */
        /* renamed from: xsna.lhu0$c$c, reason: collision with other inner class name */
        public static final class C3269c implements c {
            public final gzs<s3q0> a;

            public C3269c() {
                this(null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3269c) && epx.f(this.a, ((C3269c) obj).a);
            }

            public final int hashCode() {
                gzs<s3q0> gzsVar = this.a;
                if (gzsVar == null) {
                    return 0;
                }
                return gzsVar.hashCode();
            }

            public final String toString() {
                return uf3.d(new StringBuilder("Hide(onClick="), this.a, ')');
            }

            public C3269c(kl4 kl4Var) {
                this.a = kl4Var;
            }
        }
    }

    public lhu0(Context context) {
        super(context, null, 0);
        this.l = true;
        LayoutInflater.from(context).inflate(R.layout.pds_post_caption, (ViewGroup) this, true);
        this.b = findViewById(R.id.pds_post_caption_root);
        this.c = (VkImageSimple) findViewById(R.id.pds_post_caption_icon);
        this.d = (VkLinkedText) findViewById(R.id.pds_post_caption_text);
        this.e = (VkText) findViewById(R.id.pds_post_caption_action);
        this.f = findViewById(R.id.pds_post_caption_chevron);
        this.g = findViewById(R.id.pds_post_caption_hide);
        this.h = findViewById(R.id.pds_post_caption_right);
    }

    private final void setIcon(a.C3268a c3268a) {
        gko gkoVar = c3268a.a;
        this.c.setImageDrawable(gko.b(gkoVar.a, getContext()));
    }

    private final void setUpActionButton(c.a aVar) {
        this.e.setText(tlo0.b.a(aVar.a, getContext()));
        this.h.setOnClickListener(new r4(aVar, 13));
    }

    private final void setUpCanClick(boolean z) {
        setEnabled(z);
        setClickable(z);
    }

    private final void setUpClose(c.C3269c c3269c) {
        this.h.setOnClickListener(new ci0(c3269c, 13));
    }

    private final void setUpLeft(a aVar) {
        bwt0.p0(this.c, aVar != null);
        if (aVar instanceof a.C3268a) {
            setIcon((a.C3268a) aVar);
        }
    }

    private final void setUpMiddle(b bVar) {
        boolean z = bVar != null;
        VkLinkedText vkLinkedText = this.d;
        bwt0.p0(vkLinkedText, z);
        if (bVar instanceof b.a) {
            vkLinkedText.setText(tlo0.b.a(((b.a) bVar).a, getContext()));
        }
    }

    private final void setUpRight(c cVar) {
        bwt0.p0(this.h, cVar != null);
        boolean z = cVar instanceof c.a;
        bwt0.p0(this.e, z);
        bwt0.p0(this.f, cVar instanceof c.b);
        boolean z2 = cVar instanceof c.C3269c;
        bwt0.p0(this.g, z2);
        if (z) {
            setUpActionButton((c.a) cVar);
        } else if (z2) {
            setUpClose((c.C3269c) cVar);
        }
    }

    public final boolean getCanClick() {
        return this.l;
    }

    @Override // android.view.View
    public final a getLeft() {
        return this.i;
    }

    public final b getMiddle() {
        return this.j;
    }

    @Override // android.view.View
    public final c getRight() {
        return this.k;
    }

    public final void setCanClick(boolean z) {
        this.l = z;
        setUpCanClick(z);
    }

    public final void setLeft(a aVar) {
        this.i = aVar;
        setUpLeft(aVar);
    }

    public final void setMiddle(b bVar) {
        this.j = bVar;
        setUpMiddle(bVar);
    }

    public final void setRight(c cVar) {
        this.k = cVar;
        setUpRight(cVar);
    }
}
