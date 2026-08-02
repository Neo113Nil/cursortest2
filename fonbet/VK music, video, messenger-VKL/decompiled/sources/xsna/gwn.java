package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.im.design.view.spoiler.SpoilerView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.dwn;
import xsna.hg1;

/* compiled from: DonationsDelegate.kt */
/* loaded from: classes6.dex */
public final class gwn {
    public final ArrayList a;
    public final dwn b;
    public final a1w c;
    public final mxv d;
    public a e;
    public io.reactivex.rxjava3.disposables.c f;

    /* compiled from: DonationsDelegate.kt */
    public static final class a extends FrameLayout {
        public final b b;
        public InterfaceC2959a c;
        public int d;
        public int e;
        public final VkImage f;
        public final SpoilerView g;
        public final VkButton h;
        public final TextView i;

        /* compiled from: DonationsDelegate.kt */
        /* renamed from: xsna.gwn$a$a, reason: collision with other inner class name */
        public interface InterfaceC2959a {

            /* compiled from: DonationsDelegate.kt */
            /* renamed from: xsna.gwn$a$a$a, reason: collision with other inner class name */
            public static final class C2960a implements InterfaceC2959a {
                public static final C2960a a = new C2960a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2960a);
                }

                public final int hashCode() {
                    return -1893999929;
                }

                public final String toString() {
                    return "Empty";
                }
            }

            /* compiled from: DonationsDelegate.kt */
            /* renamed from: xsna.gwn$a$a$b */
            public static final class b implements InterfaceC2959a {
                public final String a;

                public b(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("ForDons(donationBadge="), this.a, ')');
                }
            }

            /* compiled from: DonationsDelegate.kt */
            /* renamed from: xsna.gwn$a$a$c */
            public static final class c implements InterfaceC2959a {
                public final String a;
                public final String b;

                public c(String str, String str2) {
                    this.a = str;
                    this.b = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ForSubscribers(snippet=");
                    sb.append(this.a);
                    sb.append(", url=");
                    return ho8.a(sb, this.b, ')');
                }
            }

            /* compiled from: DonationsDelegate.kt */
            /* renamed from: xsna.gwn$a$a$d */
            public static final class d implements InterfaceC2959a {
                public final AttachImage a;

                public d(AttachImage attachImage) {
                    this.a = attachImage;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "FreeSpoiler(attach=" + this.a + ')';
                }
            }
        }

        public a(Context context, b bVar) {
            super(context);
            this.b = bVar;
            this.c = InterfaceC2959a.C2960a.a;
            jwx jwxVar = new jwx(2, 8);
            ColorDrawable colorDrawable = new ColorDrawable(context.getColor(R.color.vk_black_alpha24));
            VkImage vkImage = new VkImage(context, null, 6, 0);
            vkImage.setPlaceholderColor(e3m.f(R.attr.vk_ui_image_placeholder, context));
            vkImage.setOverlayImage(colorDrawable);
            kci.o(vkImage, jwxVar);
            this.f = vkImage;
            addView(vkImage, new FrameLayout.LayoutParams(-1, -1));
            SpoilerView spoilerView = new SpoilerView(context, null, 6);
            this.g = spoilerView;
            addView(spoilerView);
            VkButton vkButton = new VkButton(context, null, 6, 0);
            vkButton.setSize(VkButton.Size.Small);
            vkButton.setMode(VkButton.Mode.Secondary);
            vkButton.setAppearance(VkButton.Appearance.Overlay);
            vkButton.a5(false, Integer.valueOf(R.drawable.vk_icon_donut_color_16));
            vkButton.setIconSize(Integer.valueOf(cn70.b(16)));
            vkButton.setBackgroundTint(R.attr.vk_ui_background_contrast_secondary_alpha);
            this.h = vkButton;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            layoutParams.leftMargin = cn70.b(12);
            layoutParams.rightMargin = cn70.b(12);
            layoutParams.bottomMargin = cn70.b(12);
            s3q0 s3q0Var = s3q0.a;
            addView(vkButton, layoutParams);
            TextView textView = new TextView(context);
            GradientDrawable a = ful0.a(0);
            a.setCornerRadius(cn70.b(10));
            abg0 abg0Var = dhr0.t;
            a.setColor(abg0Var.c(R.attr.vk_ui_overlay_primary));
            a.setAlpha(an10.b(102.0f));
            textView.setBackground(a);
            textView.setTextSize(12.0f);
            com.vk.typography.b.k(textView, FontFamily.MEDIUM, null, 6);
            textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_contrast));
            textView.setCompoundDrawablesWithIntrinsicBounds(context.getDrawable(R.drawable.vk_icon_donut_color_12), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(cn70.b(7));
            textView.setPadding(cn70.b(7), cn70.b(5), cn70.b(7), cn70.b(5));
            textView.setVisibility(8);
            this.i = textView;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 8388691;
            layoutParams2.bottomMargin = cn70.b(10);
            layoutParams2.leftMargin = cn70.b(10);
            addView(textView, layoutParams2);
            setOnClickListener(new ci0(this, 5));
            a(this.c);
        }

        private final void setImage(InterfaceC2959a.d dVar) {
            String Fb = dVar.a.q.Fb();
            if (Fb == null) {
                Fb = "";
            }
            this.f.p0(new vlw(Fb, null));
        }

        public final void a(InterfaceC2959a interfaceC2959a) {
            boolean z = interfaceC2959a instanceof InterfaceC2959a.d;
            SpoilerView spoilerView = this.g;
            VkImage vkImage = this.f;
            TextView textView = this.i;
            VkButton vkButton = this.h;
            if (z) {
                vkImage.setVisibility(0);
                spoilerView.setVisibility(0);
                vkButton.setVisibility(8);
                textView.setVisibility(8);
                setImage((InterfaceC2959a.d) interfaceC2959a);
                return;
            }
            if (interfaceC2959a instanceof InterfaceC2959a.b) {
                vkImage.setVisibility(8);
                spoilerView.setVisibility(8);
                vkButton.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(((InterfaceC2959a.b) interfaceC2959a).a);
                return;
            }
            if (interfaceC2959a instanceof InterfaceC2959a.c) {
                vkImage.setVisibility(8);
                spoilerView.setVisibility(0);
                vkButton.setVisibility(0);
                textView.setVisibility(8);
                vkButton.setText(((InterfaceC2959a.c) interfaceC2959a).a);
                return;
            }
            if (!(interfaceC2959a instanceof InterfaceC2959a.C2960a)) {
                throw new NoWhenBranchMatchedException();
            }
            spoilerView.setVisibility(8);
            vkImage.setVisibility(8);
            vkButton.setVisibility(8);
            textView.setVisibility(8);
        }

        public final InterfaceC2959a getState() {
            return this.c;
        }

        public final void setImageSize(Image image) {
            float D1 = image != null ? image.D1() : 1.0f;
            float f = D1 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? D1 : 1.0f;
            int z = iah0.z(getContext());
            int b = an10.b(z / f);
            if (z == this.d && b == this.e) {
                return;
            }
            this.d = z;
            this.e = b;
            this.f.setLayoutParams(new FrameLayout.LayoutParams(this.d, this.e, 17));
            this.g.setLayoutParams(new FrameLayout.LayoutParams(this.d, this.e, 17));
            requestLayout();
        }

        public final void setState(InterfaceC2959a interfaceC2959a) {
            if (epx.f(this.c, interfaceC2959a)) {
                return;
            }
            this.c = interfaceC2959a;
            a(interfaceC2959a);
        }
    }

    /* compiled from: DonationsDelegate.kt */
    public final class b {
        public final Context a;
        public final AttachImage b;

        public b(Context context, AttachImage attachImage) {
            this.a = context;
            this.b = attachImage;
        }
    }

    public gwn(ArrayList arrayList, dwn dwnVar, a1w a1wVar, mxv mxvVar) {
        this.a = arrayList;
        this.b = dwnVar;
        this.c = a1wVar;
        this.d = mxvVar;
    }

    public final FrameLayout a(fnw fnwVar, int i) {
        a.InterfaceC2959a interfaceC2959a;
        AttachWithImage attachWithImage = (AttachWithImage) j5g.b0(i, this.a);
        AttachImage attachImage = attachWithImage instanceof AttachImage ? (AttachImage) attachWithImage : null;
        if (attachImage == null) {
            return null;
        }
        Context context = fnwVar.getContext();
        a aVar = new a(context, new b(context, attachImage));
        dwn dwnVar = this.b;
        boolean z = attachImage.x;
        if (z && (dwnVar instanceof dwn.b)) {
            dwn.b bVar = (dwn.b) dwnVar;
            interfaceC2959a = new a.InterfaceC2959a.c(bVar.a, bVar.b);
        } else if (z && (dwnVar instanceof dwn.a)) {
            interfaceC2959a = new a.InterfaceC2959a.b(((dwn.a) dwnVar).a);
        } else {
            if (!z) {
                long j = attachImage.e;
                UserId userId = attachImage.d;
                a1w a1wVar = q1w.a;
                lnf lnfVar = (a1wVar != null ? a1wVar : null).r().i0;
                boolean b2 = fmk0.a.b(j, userId);
                if (attachImage.y != null && !b2) {
                    interfaceC2959a = new a.InterfaceC2959a.d(attachImage);
                }
            }
            interfaceC2959a = a.InterfaceC2959a.C2960a.a;
        }
        aVar.setState(interfaceC2959a);
        aVar.setImageSize(attachImage.q.Ab());
        this.e = aVar;
        this.f = new io.reactivex.rxjava3.internal.operators.observable.i0(this.c.l.a(), new hg1.i1()).U(new hg1.h1()).a0(asu0.a.d()).subscribe(new ez(new m1k(this, 5), 19));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(aVar, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public final boolean b(int i) {
        AttachWithImage attachWithImage = (AttachWithImage) j5g.b0(i, this.a);
        AttachImage attachImage = attachWithImage instanceof AttachImage ? (AttachImage) attachWithImage : null;
        if (attachImage == null) {
            return false;
        }
        return (this.b.equals(dwn.c.a) && attachImage.y == null) ? false : true;
    }
}
