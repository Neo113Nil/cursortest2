package xsna;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stickers.PurchaseDetails;
import com.vk.dto.stickers.PurchaseDetailsButton;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.external.miniapp.net.app.WebPhoto;
import com.vk.superapp.api.dto.app.AutoBuyStatus;
import com.vk.superapp.api.dto.app.Status;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.eav0;
import xsna.h7u0;
import xsna.kt8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class jt8 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jt8(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                StickerStockItem stickerStockItem = (StickerStockItem) obj4;
                kt8 kt8Var = (kt8) obj3;
                PurchaseDetails purchaseDetails = (PurchaseDetails) obj2;
                if (stickerStockItem.G) {
                    g2v.d().v().c(kt8Var.b, purchaseDetails, new oo(kt8Var, 9));
                } else {
                    PurchaseDetails purchaseDetails2 = stickerStockItem.F;
                    kt8.a aVar = kt8Var.j;
                    View inflate = LayoutInflater.from(aVar.a).inflate(R.layout.stickers_unavailable_details, (ViewGroup) null, false);
                    TextView textView = (TextView) inflate.findViewById(R.id.title);
                    TextView textView2 = (TextView) inflate.findViewById(R.id.message);
                    Button button = (Button) inflate.findViewById(R.id.positive_button);
                    Button button2 = (Button) inflate.findViewById(R.id.negative_button);
                    String str4 = "";
                    if (purchaseDetails2 == null || (str = purchaseDetails2.c) == null) {
                        str = "";
                    }
                    textView.setText(str);
                    if (purchaseDetails2 == null || (str2 = purchaseDetails2.d) == null) {
                        str2 = "";
                    }
                    textView2.setText(Html.fromHtml(str2, 63));
                    if ((purchaseDetails2 != null ? purchaseDetails2.e : null) != null) {
                        PurchaseDetailsButton purchaseDetailsButton = purchaseDetails2.e;
                        if ((purchaseDetailsButton != null ? purchaseDetailsButton.c : null) != null) {
                            if (purchaseDetailsButton != null && (str3 = purchaseDetailsButton.b) != null) {
                                str4 = str3;
                            }
                            button.setText(str4);
                            button2.setText(R.string.stickers_unavailable_action_not_now);
                            h7u0.a aVar2 = new h7u0.a(aVar.a);
                            aVar2.f = inflate;
                            androidx.appcompat.app.d m = aVar2.m();
                            jjc.g(button, new v63(purchaseDetails2, kt8Var, m, 2));
                            jjc.g(button2, new s6(m, 13));
                        }
                    }
                    bwt0.p0(button, false);
                    button2.setText(R.string.close);
                    h7u0.a aVar22 = new h7u0.a(aVar.a);
                    aVar22.f = inflate;
                    androidx.appcompat.app.d m2 = aVar22.m();
                    jjc.g(button, new v63(purchaseDetails2, kt8Var, m2, 2));
                    jjc.g(button2, new s6(m2, 13));
                }
                break;
            case 1:
                Context context = (Context) obj4;
                iuc0 iuc0Var = iuc0.b;
                la60 e0 = iuc0.e0();
                l6 l6Var = new l6(6, context, (Post) obj3);
                e0.getClass();
                la60.f(context, (String) obj2, l6Var);
                break;
            default:
                final bqu0 bqu0Var = (bqu0) obj4;
                final mov0 mov0Var = (mov0) obj3;
                final vu80 vu80Var = (vu80) obj2;
                final fhx0 fhx0Var = (fhx0) obj;
                bqu0Var.dismiss();
                if (fhx0Var != null) {
                    i0q0.f(new gzs() { // from class: xsna.gov0
                        @Override // xsna.gzs
                        public final Object invoke() {
                            mov0 mov0Var2 = mov0.this;
                            xwv0 xwv0Var = mov0Var2.d;
                            ggu0 ggu0Var = (ggu0) mov0Var2.f.c;
                            WebApiApplication v = xwv0Var.v();
                            long appId = v != null ? v.b : xwv0Var.getAppId();
                            String str5 = v != null ? v.w : null;
                            long j = appId;
                            fhx0 fhx0Var2 = fhx0Var;
                            Status status = fhx0Var2.b;
                            Status status2 = Status.LOADED;
                            vu80 vu80Var2 = vu80Var;
                            if (status == status2) {
                                boolean z = vu80Var2.c;
                                boolean z2 = vu80Var2.d;
                                if (fhx0Var2.h || z) {
                                    mov0Var2.a(AutoBuyStatus.NULL, j, fhx0Var2, str5, z2);
                                } else {
                                    oov0 oov0Var = new oov0(mov0Var2, j, fhx0Var2, str5, z2);
                                    Context context2 = ggu0Var.b;
                                    eav0 eav0Var = new eav0(context2, oov0Var);
                                    String str6 = fhx0Var2.e;
                                    if (str6 == null) {
                                        str6 = "";
                                    }
                                    int i2 = fhx0Var2.f;
                                    String str7 = fhx0Var2.c;
                                    int i3 = fhx0Var2.g;
                                    WebPhoto webPhoto = fhx0Var2.d;
                                    eav0.a aVar3 = new eav0.a(fhx0Var2.i, fhx0Var2.j);
                                    if (str7 == null) {
                                        String f = enj.f(R.plurals.vk_votes_plural, i3, context2);
                                        if (str6.length() > 48) {
                                            String D0 = erm0.D0(48, str6);
                                            bpn0 bpn0Var = cqm0.a;
                                            str6 = D0.concat("…");
                                        }
                                        str7 = context2.getString(R.string.vk_confirm_payment_order_description, str6, f);
                                    }
                                    String string = context2.getString(R.string.vk_confirm_payment_your_balance, enj.f(R.plurals.vk_votes_plural, i2, context2));
                                    WebImageSize a = webPhoto.a(72);
                                    eav0Var.a(new eav0.c(str7, string, a != null ? a.b : null, aVar3));
                                }
                            } else {
                                qov0 qov0Var = new qov0(new iov0(bqu0Var, mov0Var2, j, str5, vu80Var2), mov0Var2);
                                Context context3 = ggu0Var.b;
                                fav0 fav0Var = new fav0(context3, qov0Var);
                                View inflate2 = LayoutInflater.from(context3).inflate(R.layout.vk_order_retry_purchase_dialog, (ViewGroup) null, false);
                                ((Button) inflate2.findViewById(R.id.continue_playing_button)).setOnClickListener(new r4(fav0Var, 15));
                                ((Button) inflate2.findViewById(R.id.retry_button)).setOnClickListener(new ci0(fav0Var, 15));
                                fav0Var.b = new dw20.b(context3, null).D0(inflate2, false).P0().X(new v5n0(fav0Var, 23)).I0("retry_purchase");
                            }
                            return s3q0.a;
                        }
                    });
                } else {
                    mov0Var.g(VkAppsErrors.Client.USER_DENIED);
                }
                break;
        }
        return s3q0.a;
    }
}
