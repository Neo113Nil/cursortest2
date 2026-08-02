package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.shortcuts.impl.advertisement.ShortcutInfoModalView;
import com.ybsdk.feature.settings.internal.view.SettingsThemeView;

/* loaded from: classes3.dex */
public final /* synthetic */ class i8r0 implements wls {
    public final /* synthetic */ int a;

    public /* synthetic */ i8r0(int i) {
        this.a = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 adapter_delegate$lambda$0$0$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                View inflate = ((LayoutInflater) obj).inflate(foh0.ybsdk_item_settings_header, (ViewGroup) obj2, false);
                if (inflate == null) {
                    ny61.t("rootView");
                    break;
                } else {
                    TextView textView = (TextView) inflate;
                    break;
                }
            case 1:
                View inflate2 = ((LayoutInflater) obj).inflate(foh0.ybsdk_item_settings_info, (ViewGroup) obj2, false);
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate2;
                int i2 = ubh0.subtitle;
                TextView textView2 = (TextView) cma1.O(i2, inflate2);
                if (textView2 != null) {
                    i2 = ubh0.title;
                    TextView textView3 = (TextView) cma1.O(i2, inflate2);
                    if (textView3 != null) {
                        break;
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
                break;
            case 2:
                View inflate3 = ((LayoutInflater) obj).inflate(foh0.ybsdk_item_settings_edit, (ViewGroup) obj2, false);
                int i3 = ubh0.endIcon;
                if (((AppCompatImageView) cma1.O(i3, inflate3)) != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate3;
                    int i4 = ubh0.subtitle;
                    TextView textView4 = (TextView) cma1.O(i4, inflate3);
                    if (textView4 != null) {
                        i4 = ubh0.title;
                        TextView textView5 = (TextView) cma1.O(i4, inflate3);
                        if (textView5 != null) {
                            break;
                        }
                    }
                    i3 = i4;
                }
                ny61.t("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i3)));
                break;
            case 3:
                break;
            case 4:
                ((far0) obj).R.renderLead(((lar0) obj2).b.a);
                break;
            case 5:
                break;
            case 6:
                ((far0) obj).R.renderBody(((lar0) obj2).b.b);
                break;
            case 7:
                break;
            case 8:
                far0 far0Var = (far0) obj;
                far0Var.R.renderTrail(((lar0) obj2).b.c, new ear0(far0Var, 0));
                break;
            case 9:
                break;
            case 10:
                far0 far0Var2 = (far0) obj;
                far0Var2.R.setAction(((lar0) obj2).b.d, new ear0(far0Var2, 1));
                break;
            case 11:
                View inflate4 = ((LayoutInflater) obj).inflate(foh0.ybsdk_item_settings_switch_new, (ViewGroup) obj2, false);
                int i5 = ubh0.image;
                ImageView imageView = (ImageView) cma1.O(i5, inflate4);
                if (imageView != null) {
                    i5 = ubh0.switchButton;
                    SwitchCompat switchCompat = (SwitchCompat) cma1.O(i5, inflate4);
                    if (switchCompat != null) {
                        i5 = ubh0.title;
                        TextView textView6 = (TextView) cma1.O(i5, inflate4);
                        if (textView6 != null) {
                            break;
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i5)));
                break;
            case 12:
                View inflate5 = ((LayoutInflater) obj).inflate(foh0.ybsdk_item_settings_soon, (ViewGroup) obj2, false);
                int i6 = ubh0.soonBadge;
                if (((TextView) cma1.O(i6, inflate5)) != null) {
                    i6 = ubh0.title;
                    TextView textView7 = (TextView) cma1.O(i6, inflate5);
                    if (textView7 != null) {
                        break;
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate5.getResources().getResourceName(i6)));
                break;
            case 13:
                View inflate6 = ((LayoutInflater) obj).inflate(foh0.ybsdk_item_settings_spacer, (ViewGroup) obj2, false);
                if (inflate6 == null) {
                    ny61.t("rootView");
                    break;
                } else {
                    break;
                }
            case 14:
                View inflate7 = ((LayoutInflater) obj).inflate(foh0.ybsdk_item_settings_switch, (ViewGroup) obj2, false);
                int i7 = ubh0.subtitle;
                TextView textView8 = (TextView) cma1.O(i7, inflate7);
                if (textView8 != null) {
                    i7 = ubh0.subtitleEndIcon;
                    ImageView imageView2 = (ImageView) cma1.O(i7, inflate7);
                    if (imageView2 != null) {
                        i7 = ubh0.switchButton;
                        SwitchCompat switchCompat2 = (SwitchCompat) cma1.O(i7, inflate7);
                        if (switchCompat2 != null) {
                            i7 = ubh0.title;
                            TextView textView9 = (TextView) cma1.O(i7, inflate7);
                            if (textView9 != null) {
                                break;
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate7.getResources().getResourceName(i7)));
                break;
            case 15:
                View inflate8 = ((LayoutInflater) obj).inflate(foh0.ybsdk_item_settings_theme, (ViewGroup) obj2, false);
                int i8 = ubh0.darkTheme;
                SettingsThemeView settingsThemeView = (SettingsThemeView) cma1.O(i8, inflate8);
                if (settingsThemeView != null) {
                    i8 = ubh0.lightTheme;
                    SettingsThemeView settingsThemeView2 = (SettingsThemeView) cma1.O(i8, inflate8);
                    if (settingsThemeView2 != null) {
                        i8 = ubh0.systemTheme;
                        SettingsThemeView settingsThemeView3 = (SettingsThemeView) cma1.O(i8, inflate8);
                        if (settingsThemeView3 != null) {
                            break;
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate8.getResources().getResourceName(i8)));
                break;
            case 16:
                View inflate9 = ((LayoutInflater) obj).inflate(foh0.ybsdk_item_settings_title, (ViewGroup) obj2, false);
                int i9 = ubh0.description;
                TextView textView10 = (TextView) cma1.O(i9, inflate9);
                if (textView10 != null) {
                    i9 = ubh0.title;
                    TextView textView11 = (TextView) cma1.O(i9, inflate9);
                    if (textView11 != null) {
                        break;
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate9.getResources().getResourceName(i9)));
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                View inflate10 = ((LayoutInflater) obj).inflate(clh0.hub_shimmering_view_holder, (ViewGroup) obj2, false);
                if (inflate10 == null) {
                    ny61.t("rootView");
                    break;
                } else {
                    break;
                }
            case 20:
                adapter_delegate$lambda$0$0$0 = ShortcutInfoModalView.adapter_delegate$lambda$0$0$0((View) obj, (nzr0) obj2);
                break;
            case 21:
                ((Integer) obj2).getClass();
                kdb1.c((fid) obj, vng.O(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ldb1.b((fid) obj, vng.O(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                py91.d((fid) obj, vng.O(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                vy91.b((fid) obj, vng.O(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                py91.c((fid) obj, vng.O(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                vy91.a((fid) obj, vng.O(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                ndb1.b((fid) obj, vng.O(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                py91.a((fid) obj, vng.O(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ndb1.c((fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ i8r0(int i, int i2) {
        this.a = i2;
    }
}
