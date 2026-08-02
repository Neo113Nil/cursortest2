package xsna;

import android.content.Context;
import android.view.View;
import com.vk.core.view.TintTextView;
import com.vk.dto.hints.HintId;
import com.vk.dto.posting.DonutPostingSettings;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: SettingsPostingView.kt */
/* loaded from: classes4.dex */
public final class f3j0 implements jk6, qv9, View.OnClickListener, w8i {
    public static final SimpleDateFormat p = new SimpleDateFormat("HH:mm", Locale.getDefault());
    public final z84 b;
    public ckc0 c;
    public jec0 d;
    public View e;
    public TintTextView f;
    public TintTextView g;
    public TintTextView h;
    public TintTextView i;
    public TintTextView j;
    public TintTextView k;
    public TintTextView l;
    public final bpn0 m = new bpn0(new wp40(this, 21));
    public final bpn0 n = new bpn0(new ye80(this, 14));
    public e3j0 o;

    public f3j0(z84 z84Var) {
        this.b = z84Var;
    }

    public static void d(TintTextView tintTextView) {
        if (tintTextView != null) {
            tintTextView.setDynamicBackgroundTint(R.attr.vk_ui_text_accent);
            tintTextView.setDynamicDrawableTint(R.attr.vk_ui_text_accent);
            jno0.c(tintTextView, R.attr.vk_ui_text_accent);
        }
    }

    public static void f(TintTextView tintTextView) {
        if (tintTextView != null) {
            tintTextView.setDynamicBackgroundTint(R.attr.vk_ui_write_bar_input_border_alpha);
            abg0 abg0Var = dhr0.t;
            tintTextView.setDrawableLeftTint(abg0Var.c(R.attr.vk_ui_icon_secondary));
            tintTextView.setDrawableRightTint(abg0Var.c(R.attr.vk_ui_icon_secondary));
            jno0.c(tintTextView, R.attr.vk_ui_text_secondary);
        }
    }

    @Override // xsna.qv9
    public final void b(boolean z) {
        if (z) {
            TintTextView tintTextView = this.k;
            if (tintTextView != null) {
                bwt0.p0(tintTextView, true);
            }
            f(this.k);
            return;
        }
        TintTextView tintTextView2 = this.k;
        if (tintTextView2 != null) {
            bwt0.p0(tintTextView2, false);
        }
    }

    @Override // xsna.qv9
    public final void c(boolean z) {
        Context context;
        int i = z ? R.drawable.vk_icon_grid_outline_16 : R.drawable.vk_icon_carousel_outline_16;
        int i2 = z ? R.string.newsfeed_newpost_grid : R.string.newsfeed_newpost_carousel;
        TintTextView tintTextView = this.k;
        if (tintTextView != null) {
            tintTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
        }
        TintTextView tintTextView2 = this.k;
        if (tintTextView2 != null) {
            tintTextView2.setText((tintTextView2 == null || (context = tintTextView2.getContext()) == null) ? null : context.getString(i2));
        }
        TintTextView tintTextView3 = this.k;
        if (tintTextView3 != null) {
            tintTextView3.setDynamicDrawableTint(R.attr.vk_ui_icon_secondary);
        }
    }

    @Override // xsna.jk6
    public final void d3(View view) {
        this.c = ((lyk) this.n.getValue()).a(R.string.timer, view.getContext());
        this.d = new jec0(view.getContext());
        e3j0 e3j0Var = this.o;
        if (e3j0Var != null) {
            ckc0 ckc0Var = this.c;
            if (ckc0Var == null) {
                ckc0Var = null;
            }
            e3j0Var.i = ckc0Var;
            ckc0Var.a(new rtg0(e3j0Var, 4));
        }
        e3j0 e3j0Var2 = this.o;
        if (e3j0Var2 != null) {
            jec0 jec0Var = this.d;
            if (jec0Var == null) {
                jec0Var = null;
            }
            e3j0Var2.j = jec0Var;
            jec0Var.c = new ape0(e3j0Var2, 6);
        }
        this.e = view.findViewById(R.id.posting_settings_scroll_view);
        TintTextView tintTextView = (TintTextView) view.findViewById(R.id.posting_setting_postpone_text);
        if (tintTextView != null) {
            tintTextView.setOnClickListener(this);
        } else {
            tintTextView = null;
        }
        this.f = tintTextView;
        TintTextView tintTextView2 = (TintTextView) view.findViewById(R.id.posting_setting_visibility_text);
        if (tintTextView2 != null) {
            tintTextView2.setOnClickListener(this);
        } else {
            tintTextView2 = null;
        }
        this.g = tintTextView2;
        TintTextView tintTextView3 = (TintTextView) view.findViewById(R.id.posting_setting_group_signature_text);
        if (tintTextView3 != null) {
            tintTextView3.setOnClickListener(this);
        } else {
            tintTextView3 = null;
        }
        this.h = tintTextView3;
        TintTextView tintTextView4 = (TintTextView) view.findViewById(R.id.posting_setting_copyright_text);
        if (tintTextView4 != null) {
            tintTextView4.setOnClickListener(this);
        } else {
            tintTextView4 = null;
        }
        this.i = tintTextView4;
        TintTextView tintTextView5 = (TintTextView) view.findViewById(R.id.posting_setting_donut_text);
        if (tintTextView5 != null) {
            tintTextView5.setOnClickListener(this);
        } else {
            tintTextView5 = null;
        }
        this.j = tintTextView5;
        TintTextView tintTextView6 = (TintTextView) view.findViewById(R.id.posting_carousel_grid_switcher);
        if (tintTextView6 != null) {
            tintTextView6.setOnClickListener(this);
        } else {
            tintTextView6 = null;
        }
        this.k = tintTextView6;
        TintTextView tintTextView7 = (TintTextView) view.findViewById(R.id.posting_setting_donut_duration_text);
        if (tintTextView7 != null) {
            tintTextView7.setOnClickListener(this);
        } else {
            tintTextView7 = null;
        }
        this.l = tintTextView7;
        TintTextView tintTextView8 = this.g;
        if (tintTextView8 != null) {
            tintTextView8.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.vk_icon_user_outline_16, 0, R.drawable.ic_dropdown_12, 0);
        }
        TintTextView tintTextView9 = this.j;
        if (tintTextView9 != null) {
            tintTextView9.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.vk_icon_user_outline_16, 0, R.drawable.ic_dropdown_12, 0);
        }
        TintTextView tintTextView10 = this.k;
        if (tintTextView10 != null) {
            tintTextView10.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.vk_icon_grid_outline_16, 0, 0, 0);
        }
        f(this.f);
        f(this.g);
        f(this.h);
        f(this.j);
        f(this.l);
        f(this.k);
        TintTextView tintTextView11 = this.g;
        if (tintTextView11 == null || !bwt0.K(tintTextView11)) {
            return;
        }
        h7v.f(pla.e().b(), tintTextView11, HintId.INFO_FRIENDS_BEST_FRIENDS_SETTINGS.getId(), null, 12);
    }

    public final void h(boolean z) {
        TintTextView tintTextView = this.l;
        if (tintTextView != null) {
            bwt0.p0(tintTextView, z);
        }
    }

    public final void i() {
        TintTextView tintTextView = this.j;
        if (tintTextView != null) {
            tintTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.vk_icon_donate_outline_16, 0, R.drawable.ic_dropdown_12, 0);
        }
        TintTextView tintTextView2 = this.j;
        if (tintTextView2 != null) {
            tintTextView2.setText(R.string.newsfeed_newpost_for_paid);
        }
        d(this.j);
    }

    public final void j(boolean z) {
        TintTextView tintTextView = this.f;
        if (tintTextView != null) {
            bwt0.p0(tintTextView, z);
        }
    }

    public final void l(boolean z) {
        TintTextView tintTextView = this.h;
        if (tintTextView != null) {
            bwt0.p0(tintTextView, z);
        }
    }

    public final void m(boolean z) {
        TintTextView tintTextView = this.g;
        if (tintTextView != null) {
            bwt0.p0(tintTextView, z);
        }
    }

    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.posting_setting_postpone_text) {
            e3j0 e3j0Var = this.o;
            if (e3j0Var != null) {
                if (e3j0Var.b.Um() != null) {
                    f3j0 f3j0Var = e3j0Var.c;
                    TintTextView tintTextView = f3j0Var.f;
                    tlc0 tlc0Var = (tlc0) f3j0Var.m.getValue();
                    if (tintTextView != null && tlc0Var != null) {
                        tlc0Var.b(tintTextView);
                    }
                } else {
                    e3j0Var.g();
                }
                jbc0 jbc0Var = (jbc0) e3j0Var.p.getValue();
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
                jbc0Var.g();
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.posting_setting_visibility_text) {
            e3j0 e3j0Var2 = this.o;
            if (e3j0Var2 != null) {
                e3j0Var2.R6();
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.posting_setting_group_signature_text) {
            e3j0 e3j0Var3 = this.o;
            if (e3j0Var3 != null) {
                e3j0Var3.b.ue(!r7.Jc());
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.posting_setting_copyright_text) {
            e3j0 e3j0Var4 = this.o;
            if (e3j0Var4 != null) {
                f3j0 f3j0Var2 = e3j0Var4.c;
                TintTextView tintTextView2 = f3j0Var2.i;
                tlc0 tlc0Var2 = (tlc0) f3j0Var2.m.getValue();
                if (tintTextView2 == null || tlc0Var2 == null) {
                    return;
                }
                tlc0Var2.a(tintTextView2);
                return;
            }
            return;
        }
        if (valueOf == null || valueOf.intValue() != R.id.posting_setting_donut_text) {
            if (valueOf == null || valueOf.intValue() != R.id.posting_setting_donut_duration_text) {
                if (valueOf != null && valueOf.intValue() == R.id.posting_carousel_grid_switcher) {
                    this.b.z();
                    return;
                }
                return;
            }
            e3j0 e3j0Var5 = this.o;
            if (e3j0Var5 != null) {
                qdc0 qdc0Var = e3j0Var5.b;
                jzn jznVar = e3j0Var5.j;
                if (jznVar != null) {
                    jznVar.a(qdc0Var.Ld(), qdc0Var.B6());
                    return;
                }
                return;
            }
            return;
        }
        e3j0 e3j0Var6 = this.o;
        if (e3j0Var6 != null) {
            f3j0 f3j0Var3 = e3j0Var6.c;
            qdc0 qdc0Var2 = e3j0Var6.b;
            qdc0Var2.j2(!qdc0Var2.Zg());
            if (!qdc0Var2.Zg()) {
                TintTextView tintTextView3 = f3j0Var3.j;
                if (tintTextView3 != null) {
                    tintTextView3.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.vk_icon_user_outline_16, 0, R.drawable.ic_dropdown_12, 0);
                }
                TintTextView tintTextView4 = f3j0Var3.j;
                if (tintTextView4 != null) {
                    tintTextView4.setText(R.string.newsfeed_newpost_for_all);
                }
                f(f3j0Var3.j);
                f3j0Var3.h(false);
                qdc0Var2.M6(null);
                return;
            }
            f3j0Var3.i();
            f3j0Var3.h(true);
            if (qdc0Var2.Ld() == null) {
                DonutPostingSettings.Duration duration = (DonutPostingSettings.Duration) j5g.a0(qdc0Var2.B6());
                qdc0Var2.M6(duration != null ? Integer.valueOf(duration.b) : null);
                jzn jznVar2 = e3j0Var6.j;
                if (jznVar2 != null) {
                    jznVar2.a(qdc0Var2.Ld(), qdc0Var2.B6());
                }
            }
        }
    }

    @Override // xsna.jk6
    public final void onDestroyView() {
    }
}
