package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkPicture;
import com.vkontakte.android.R;
import xsna.gko;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: FeedCompactAudioAttachmentView.kt */
/* loaded from: classes18.dex */
public final class txq extends FrameLayout {
    public static final /* synthetic */ int j = 0;
    public final VkCell b;
    public boolean c;
    public boolean d;
    public final bpn0 e;
    public final bpn0 f;
    public gzs<s3q0> g;
    public gzs<s3q0> h;
    public gzs<s3q0> i;

    /* compiled from: FeedCompactAudioAttachmentView.kt */
    public static final class a {
        public final boolean a;
        public final String b;
        public final Integer c;
        public final String d;
        public final String e;
        public final String f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;

        public a() {
            this(false, null, null, null, null, null, false, false, false, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j;
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            return Boolean.hashCode(this.j) + qoy.b(qoy.b(qoy.b((hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(isExplicit=");
            sb.append(this.a);
            sb.append(", photoUrl=");
            sb.append(this.b);
            sb.append(", photoRes=");
            sb.append(this.c);
            sb.append(", title=");
            sb.append(this.d);
            sb.append(", subTitle=");
            sb.append(this.e);
            sb.append(", buttonText=");
            sb.append(this.f);
            sb.append(", showPlayButton=");
            sb.append(this.g);
            sb.append(", showAddButton=");
            sb.append(this.h);
            sb.append(", showDoneButton=");
            sb.append(this.i);
            sb.append(", showChevron=");
            return defpackage.q0.a(sb, this.j, ')');
        }

        public a(boolean z, String str, Integer num, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.a = z;
            this.b = str;
            this.c = num;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = z2;
            this.h = z3;
            this.i = z4;
            this.j = z5;
        }
    }

    /* compiled from: FeedCompactAudioAttachmentView.kt */
    public final class b implements VkCell.d {
        public final VkPicture a;

        public b(Context context, gzs<s3q0> gzsVar) {
            VkPicture vkPicture = new VkPicture(context, null, 6, 0);
            vkPicture.setScaleType(ImageView.ScaleType.CENTER);
            vkPicture.y0(cn70.a() * 0.5f, dhr0.t.c(R.attr.vk_ui_image_border_alpha));
            vkPicture.setCornerRadius(VkPicture.CornerRadius.Large);
            jjc.g(vkPicture, new uxq(0, gzsVar));
            this.a = vkPicture;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            int i = txq.j;
            txq txqVar = txq.this;
            txqVar.getClass();
            d dVar = fVar instanceof d ? (d) fVar : null;
            if (dVar != null) {
                String str = dVar.a;
                VkPicture vkPicture = this.a;
                if (str != null) {
                    vkPicture.o0(str, null);
                }
                Integer num = dVar.b;
                if (num != null) {
                    vkPicture.setImageResource(num.intValue());
                    txqVar.getClass();
                    gpo0.f(vkPicture, Integer.valueOf(R.attr.vk_ui_icon_secondary));
                    vkPicture.setBackgroundDrawable(new dpg0(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_background_secondary)), cn70.c(8)));
                }
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: FeedCompactAudioAttachmentView.kt */
    public final class c implements VkCell.e {
        public final gzs<s3q0> a;

        public c(gzs<s3q0> gzsVar) {
            this.a = gzsVar;
        }

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return txq.this.new b(context, this.a);
        }
    }

    /* compiled from: FeedCompactAudioAttachmentView.kt */
    public static final class d implements VkCell.f {
        public final String a;
        public final Integer b;

        public d(String str, Integer num) {
            this.a = str;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.b;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PhotoParams(imageUrl=");
            sb.append(this.a);
            sb.append(", imageRes=");
            return uqi.b(sb, this.b, ')');
        }
    }

    public txq(Context context) {
        super(context, null, 0);
        this.e = new bpn0(new ml7(this));
        this.f = new bpn0(new qo0(this));
        LayoutInflater.from(context).inflate(R.layout.feed_compact_audio_attachment_view, this);
        VkCell vkCell = (VkCell) findViewById(R.id.feed_audio_attachment_cell);
        vkCell.setLeftMainPictureController(new c(null));
        this.b = vkCell;
    }

    public static eko a(int i) {
        abg0 abg0Var = dhr0.t;
        baf0 b2 = abg0Var.b(i, R.attr.vk_ui_icon_primary);
        qog0 qog0Var = new qog0(abg0Var.c(R.attr.vk_ui_background_secondary));
        qog0Var.f(true);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{qog0Var, b2});
        layerDrawable.setLayerSize(0, cn70.b(36), cn70.b(36));
        layerDrawable.setLayerSize(1, cn70.b(24), cn70.b(24));
        layerDrawable.setLayerGravity(1, 17);
        return new eko(layerDrawable);
    }

    private final dko getPauseButton() {
        return (dko) this.f.getValue();
    }

    private final dko getPlayButton() {
        return (dko) this.e.getValue();
    }

    public final void b(String str, boolean z) {
        VkCell vkCell = this.b;
        VkCell.Middle.b middle = vkCell.getMiddle();
        VkCell.Middle.b bVar = null;
        VkCell.Middle.e eVar = null;
        if (middle != null) {
            if (str != null) {
                eVar = new VkCell.Middle.e(oq.d(tlo0.Companion, str), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (!this.d || z) ? null : new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_error_circle_16), new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), new tlo0.f(R.string.music_talkback_explicit), (Size) null, 8), 18);
            }
            bVar = VkCell.Middle.b.a(middle, eVar);
        }
        vkCell.setMiddle(bVar);
    }

    public final void setAddOrRemoveButtonClickListener(gzs<s3q0> gzsVar) {
        this.h = gzsVar;
    }

    public final void setAttachment(a aVar) {
        VkCell.Middle.e eVar;
        int i;
        boolean z = aVar.h;
        boolean z2 = aVar.i;
        boolean z3 = aVar.a;
        String str = aVar.d;
        String str2 = aVar.b;
        Integer num = aVar.c;
        VkCell.Left.b a2 = (str2 == null && num == null) ? null : VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(new d(str2, num), VkCell.Left.Main.Size.Small));
        VkCell vkCell = this.b;
        vkCell.setLeft(a2);
        VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
        String str3 = aVar.e;
        if (str != null) {
            eVar = new VkCell.Middle.e(oq.d(tlo0.Companion, str), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, z3 ? new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_error_circle_16), new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), new tlo0.f(R.string.music_talkback_explicit), (Size) null, 8) : null, 18);
        } else {
            eVar = null;
        }
        int i2 = 12;
        VkCell.Right.d dVar = null;
        vkCell.setMiddle(VkCell.Middle.a.a(aVar2, eVar, str3 != null ? new VkCell.Middle.d(oq.d(tlo0.Companion, str3), (gzs) null, 1, TextUtils.TruncateAt.END, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50) : null, null, 12));
        boolean z4 = aVar.j;
        String str4 = aVar.f;
        if (z4) {
            dVar = VkCell.Right.c.a(VkCell.Right.Companion, null, null, null, new VkCell.Right.b((izs) null, (tlo0.f) null, (k1u0.a) null, 7), 23);
        } else {
            boolean z5 = aVar.g;
            if (z5 && !z && !z2) {
                dVar = VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.b(getPlayButton(), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_primary)), (Size) null, (tlo0) tq.h(tlo0.Companion, R.string.music_talkback_play), false, (gzs) new dne(this, 22), 20), null, null, 29);
            } else if (z5 || z || z2) {
                VkCell.Right.c cVar = VkCell.Right.Companion;
                if (z) {
                    gko.b bVar = gko.Companion;
                    i = R.drawable.vk_icon_add_24;
                } else {
                    gko.b bVar2 = gko.Companion;
                    i = R.drawable.vk_icon_done_24;
                }
                dVar = VkCell.Right.c.a(cVar, null, new VkCell.Right.e.c(new VkCell.Right.e.b((dko) new gko(i), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_primary)), (Size) null, (tlo0) (z ? tq.h(tlo0.Companion, R.string.music_add_to_my_music) : tq.h(tlo0.Companion, R.string.music_remove_from_my_music)), false, (gzs) new fbh(this, i2), 20), new VkCell.Right.e.b(getPlayButton(), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_primary)), (Size) null, (tlo0) tq.h(tlo0.Companion, R.string.music_talkback_play), false, (gzs) new myh(this, i2), 20)), null, null, 29);
            } else if (myc0.f(str4)) {
                dVar = VkCell.Right.c.a(VkCell.Right.Companion, new VkCell.Right.a.b(oq.d(tlo0.Companion, str4), new i5f(this, 21), VkButton.Appearance.Neutral, VkButton.Mode.Secondary, VkButton.Size.Small, null, null, null, 2016), null, null, null, 30);
            }
        }
        vkCell.setRight(dVar);
        this.c = z || z2;
        this.d = z3;
    }

    public final void setButtonClickListener(gzs<s3q0> gzsVar) {
        this.i = gzsVar;
    }

    public final void setItemClickListener(gzs<s3q0> gzsVar) {
        jjc.g(this.b, new sxq(0, gzsVar));
    }

    public final void setPhotoClickListener(gzs<s3q0> gzsVar) {
        this.b.setLeftMainPictureController(new c(gzsVar));
    }

    public final void setPlayButtonClickListener(gzs<s3q0> gzsVar) {
        this.g = gzsVar;
    }

    public final void setPlayingState(boolean z) {
        boolean z2 = this.c;
        VkCell vkCell = this.b;
        VkCell.Right.d dVar = null;
        if (!z2) {
            VkCell.Right.d right = vkCell.getRight();
            if (right != null) {
                dVar = VkCell.Right.d.a(right, null, new VkCell.Right.e.b(z ? getPauseButton() : getPlayButton(), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_primary)), (Size) null, (tlo0) (z ? tq.h(tlo0.Companion, R.string.music_talkback_pause) : tq.h(tlo0.Companion, R.string.music_talkback_play)), false, (gzs) new xrj(this, 6), 20), null, null, null, 29);
            }
            vkCell.setRight(dVar);
            return;
        }
        VkCell.Right.d right2 = vkCell.getRight();
        VkCell.Right.e eVar = right2 != null ? right2.b : null;
        VkCell.Right.e.c cVar = eVar instanceof VkCell.Right.e.c ? (VkCell.Right.e.c) eVar : null;
        if (cVar == null) {
            return;
        }
        VkCell.Right.d right3 = vkCell.getRight();
        if (right3 != null) {
            dVar = VkCell.Right.d.a(right3, null, new VkCell.Right.e.c(cVar.a, new VkCell.Right.e.b(z ? getPauseButton() : getPlayButton(), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_primary)), (Size) null, (tlo0) (z ? tq.h(tlo0.Companion, R.string.music_talkback_pause) : tq.h(tlo0.Companion, R.string.music_talkback_play)), false, (gzs) new ldl(this, 10), 20)), null, null, null, 29);
        }
        vkCell.setRight(dVar);
    }
}
