package xsna;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import xsna.h7u0;
import xsna.tlo0;
import xsna.y7j;

/* compiled from: ContactAndLinksItem.kt */
/* loaded from: classes5.dex */
public final class y7j extends we6 {
    public final String g;
    public final CharSequence h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public final View.OnClickListener m;
    public final String n;
    public final UserId o;
    public final String p;
    public final String q;
    public final int r;

    /* compiled from: ContactAndLinksItem.kt */
    public static final class a extends vif0<y7j> {
        public final VkCell n;

        public a(VkCell vkCell, ViewGroup viewGroup) {
            super(vkCell, viewGroup);
            this.n = vkCell;
            vkCell.setLeftMainAvatarController(new mmw());
        }

        public static void q6(y7j y7jVar, boolean z) {
            String str = y7jVar.p;
            if (str != null) {
                g2h g2hVar = new g2h(y7jVar.o);
                String str2 = y7jVar.q;
                if (str2 != null) {
                    g2hVar.e = str2;
                }
                g2hVar.b = str;
                g2hVar.c = z ? "long_tap" : "tap";
                g2hVar.a();
            }
        }

        public static void s6(String str, y7j y7jVar) {
            String str2 = y7jVar.p;
            if (str2 != null) {
                g2h g2hVar = new g2h(y7jVar.o);
                String str3 = y7jVar.q;
                if (str3 != null) {
                    g2hVar.e = str3;
                }
                g2hVar.b = str2;
                g2hVar.c = "copy";
                g2hVar.f = str;
                g2hVar.a();
            }
        }

        @Override // xsna.vif0
        public final void i6(y7j y7jVar) {
            SpannableString spannableString;
            SpannableString spannableString2;
            SpannableString spannableString3;
            VkCell.Middle.c cVar;
            pcc pccVar;
            final y7j y7jVar2 = y7jVar;
            View.OnClickListener onClickListener = y7jVar2.m;
            int i = y7jVar2.l;
            String str = y7jVar2.j;
            String str2 = y7jVar2.i;
            if (str2 != null) {
                w7j w7jVar = new w7j(str2, y7jVar2);
                w7jVar.b(R.attr.vk_ui_text_link);
                spannableString = new SpannableString(str2);
                spannableString.setSpan(w7jVar, 0, spannableString.length(), 0);
            } else {
                spannableString = null;
            }
            if (str != null) {
                x7j x7jVar = new x7j(str, y7jVar2);
                x7jVar.b(R.attr.vk_ui_text_link);
                spannableString2 = new SpannableString(str);
                spannableString2.setSpan(x7jVar, 0, spannableString2.length(), 0);
            } else {
                spannableString2 = null;
            }
            if (spannableString == null && spannableString2 == null) {
                spannableString3 = null;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (spannableString != null) {
                    spannableStringBuilder.append((CharSequence) spannableString);
                }
                if (spannableString != null && spannableString2 != null) {
                    spannableStringBuilder.append((CharSequence) "\n");
                }
                if (spannableString2 != null) {
                    spannableStringBuilder.append((CharSequence) spannableString2);
                }
                spannableString3 = new SpannableString(spannableStringBuilder);
            }
            VkCell.Middle.a aVar = VkCell.Middle.Companion;
            String str3 = y7jVar2.g;
            VkCell.Middle.e eVar = (str3 == null || drm0.N(str3)) ? null : new VkCell.Middle.e(oq.d(tlo0.Companion, str3), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62);
            CharSequence charSequence = y7jVar2.h;
            VkCell.Middle.d dVar = (charSequence == null || drm0.N(charSequence)) ? null : new VkCell.Middle.d(u11.f(tlo0.Companion, charSequence), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62);
            if (spannableString3 != null) {
                tlo0.Companion.getClass();
                cVar = new VkCell.Middle.c(new tlo0.h(spannableString3), null, 0, 14);
            } else {
                cVar = null;
            }
            VkCell.Middle.b a = VkCell.Middle.a.a(aVar, eVar, dVar, cVar, 8);
            VkCell vkCell = this.n;
            vkCell.setMiddle(a);
            if (i != 0) {
                pccVar = new pcc(dhr0.t.c(R.attr.vk_ui_image_placeholder));
                pccVar.d = false;
                float f = 48;
                pccVar.setBounds(0, 0, iah0.a(f), iah0.a(f));
                pccVar.e = enj.e(i, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary, this.itemView.getContext());
            } else {
                pccVar = null;
            }
            vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new pmw(y7jVar2.k, pccVar), VkCell.Left.Main.Size.Medium)));
            String str4 = y7jVar2.n;
            if (onClickListener != null) {
                bwt0.i0(this.itemView, new n6f(6, y7jVar2, this));
            } else {
                this.itemView.setOnClickListener(null);
            }
            if (str4 == null || !(!drm0.N(str4))) {
                this.itemView.setOnLongClickListener(null);
            } else {
                this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.u7j
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        final y7j y7jVar3 = y7jVar2;
                        final boolean z = y7jVar3.m != null;
                        final y7j.a aVar2 = y7j.a.this;
                        String[] strArr = z ? new String[]{aVar2.itemView.getContext().getString(R.string.open), aVar2.itemView.getContext().getString(R.string.profile_copy)} : new String[]{aVar2.itemView.getContext().getString(R.string.profile_copy)};
                        h7u0.a aVar3 = new h7u0.a(aVar2.itemView.getContext());
                        aVar3.h0(y7jVar3.n);
                        aVar3.T(strArr, new DialogInterface.OnClickListener() { // from class: xsna.v7j
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                boolean z2 = z;
                                y7j y7jVar4 = y7jVar3;
                                y7j.a aVar4 = aVar2;
                                if (!z2) {
                                    mhy.a(aVar4.itemView.getContext(), y7jVar4.n);
                                    cvk.u(R.string.link_copied, false);
                                    String str5 = y7jVar4.n;
                                    y7j.a.s6(str5 != null ? str5 : "", y7jVar4);
                                    return;
                                }
                                if (i2 == 0) {
                                    View.OnClickListener onClickListener2 = y7jVar4.m;
                                    if (onClickListener2 != null) {
                                        onClickListener2.onClick(aVar4.itemView);
                                    }
                                    y7j.a.q6(y7jVar4, true);
                                    return;
                                }
                                if (i2 != 1) {
                                    return;
                                }
                                mhy.a(aVar4.itemView.getContext(), y7jVar4.n);
                                cvk.u(R.string.link_copied, false);
                                String str6 = y7jVar4.n;
                                y7j.a.s6(str6 != null ? str6 : "", y7jVar4);
                            }
                        });
                        aVar3.m();
                        return true;
                    }
                });
            }
            this.itemView.setClickable(onClickListener != null);
            this.itemView.setLongClickable(str4 != null);
        }
    }

    public y7j() {
        this(null, null, null, 0, null, null, null, null, 2047);
    }

    @Override // xsna.we6
    public final vif0 a(ViewGroup viewGroup) {
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return new a(vkCell, viewGroup);
    }

    @Override // xsna.we6
    public final int h() {
        return this.r;
    }

    public /* synthetic */ y7j(String str, String str2, String str3, int i, View.OnClickListener onClickListener, String str4, UserId userId, String str5, int i2) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, null, null, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : onClickListener, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? UserId.d : userId, (i2 & 512) != 0 ? null : str5, (i2 & 1024) == 0 ? "group_info" : null);
    }

    public y7j(String str, CharSequence charSequence, String str2, String str3, String str4, int i, View.OnClickListener onClickListener, String str5, UserId userId, String str6, String str7) {
        this.g = str;
        this.h = charSequence;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = i;
        this.m = onClickListener;
        this.n = str5;
        this.o = userId;
        this.p = str6;
        this.q = str7;
        this.r = -1015;
    }
}
