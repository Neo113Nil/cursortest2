package xsna;

import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.im.settings.DarkThemeTimetableFragment;
import com.vkontakte.android.fragments.WikiViewFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class mkc implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mkc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                qkc qkcVar = (qkc) obj2;
                ClickableMarketItem clickableMarketItem = (ClickableMarketItem) obj;
                qkcVar.m(clickableMarketItem);
                qkcVar.i(view.getContext(), clickableMarketItem);
                break;
            case 1:
                com.google.android.material.timepicker.b bVar = (com.google.android.material.timepicker.b) obj;
                int i2 = DarkThemeTimetableFragment.Q;
                ((wzs) obj2).invoke(Integer.valueOf(bVar.Dn()), Integer.valueOf(bVar.En()));
                break;
            case 2:
                ehw ehwVar = (ehw) obj;
                ((ghw) obj2).m.Z1(new uai0(ehwVar.a, ehwVar.b));
                break;
            case 3:
                com.vk.core.ui.bottomsheet.internal.e eVar = (com.vk.core.ui.bottomsheet.internal.e) obj2;
                c33 c33Var = (c33) obj;
                TextView textView = eVar.u;
                if (textView == null) {
                    textView = null;
                }
                if (!epx.f(view, textView)) {
                    TextView textView2 = eVar.z;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    if (!epx.f(view, textView2)) {
                        TextView textView3 = eVar.n;
                        if (epx.f(view, textView3 != null ? textView3 : null)) {
                            hz20 hz20Var = eVar.o;
                            if (hz20Var != null) {
                                hz20Var.a(-3);
                            }
                            if (eVar.N) {
                                c33Var.dismiss();
                                break;
                            }
                        }
                    } else {
                        TextView textView4 = eVar.z;
                        Object tag = (textView4 != null ? textView4 : null).getTag();
                        if (!epx.f(tag, -2)) {
                            if (epx.f(tag, -5)) {
                                com.vk.qrcode.e eVar2 = eVar.C;
                                if (eVar2 != null) {
                                    eVar2.a(-5);
                                }
                                if (!eVar.D) {
                                    if (eVar.N) {
                                        c33Var.dismiss();
                                        break;
                                    }
                                } else {
                                    eVar.d(-2);
                                    break;
                                }
                            }
                        } else {
                            hz20 hz20Var2 = eVar.A;
                            if (hz20Var2 != null) {
                                hz20Var2.a(-2);
                            }
                            if (eVar.C != null) {
                                eVar.d(-5);
                                break;
                            } else if (eVar.N) {
                                c33Var.dismiss();
                                break;
                            }
                        }
                    }
                } else {
                    TextView textView5 = eVar.u;
                    Object tag2 = (textView5 != null ? textView5 : null).getTag();
                    if (!epx.f(tag2, -1)) {
                        if (epx.f(tag2, -4)) {
                            com.vk.qrcode.e eVar3 = eVar.x;
                            if (eVar3 != null) {
                                eVar3.a(-4);
                            }
                            if (!eVar.y) {
                                if (eVar.N) {
                                    c33Var.dismiss();
                                    break;
                                }
                            } else {
                                eVar.d(-1);
                                break;
                            }
                        }
                    } else {
                        hz20 hz20Var3 = eVar.v;
                        if (hz20Var3 != null) {
                            hz20Var3.a(-1);
                        }
                        if (eVar.x != null) {
                            eVar.d(-4);
                            break;
                        } else if (eVar.N) {
                            c33Var.tn();
                            break;
                        }
                    }
                }
                break;
            default:
                WebView webView = (WebView) obj2;
                WikiViewFragment wikiViewFragment = (WikiViewFragment) obj;
                int i3 = WikiViewFragment.q0;
                if (!webView.canGoBack()) {
                    h3p0.b(wikiViewFragment);
                    break;
                } else {
                    webView.goBack();
                    break;
                }
        }
    }
}
