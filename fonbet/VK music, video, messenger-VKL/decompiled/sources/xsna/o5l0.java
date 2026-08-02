package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.vk.common.links.AwayLink;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.stickers.PurchaseDetails;
import com.vk.dto.stickers.PurchaseDetailsButton;
import com.vk.dto.stickers.StickerStockItem;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: StickerPackUnavailableDialog.kt */
/* loaded from: classes6.dex */
public final class o5l0 {
    public static void a(final Context context, StickerStockItem stickerStockItem) {
        String str;
        String str2;
        String str3;
        View inflate = LayoutInflater.from(context).inflate(R.layout.stickers_unavailable_details, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.message);
        Button button = (Button) inflate.findViewById(R.id.positive_button);
        Button button2 = (Button) inflate.findViewById(R.id.negative_button);
        final PurchaseDetails purchaseDetails = stickerStockItem.F;
        String str4 = "";
        if (purchaseDetails == null || (str = purchaseDetails.c) == null) {
            str = "";
        }
        textView.setText(str);
        if (purchaseDetails == null || (str2 = purchaseDetails.d) == null) {
            str2 = "";
        }
        textView2.setText(str2);
        if ((purchaseDetails != null ? purchaseDetails.e : null) != null) {
            PurchaseDetailsButton purchaseDetailsButton = purchaseDetails.e;
            if ((purchaseDetailsButton != null ? purchaseDetailsButton.c : null) != null) {
                if (purchaseDetailsButton != null && (str3 = purchaseDetailsButton.b) != null) {
                    str4 = str3;
                }
                button.setText(str4);
                button2.setText(R.string.stickers_unavailable_action_not_now);
                int i = h7u0.p;
                h7u0.a a = h7u0.b.a(context);
                a.f = inflate;
                final androidx.appcompat.app.d m = a.m();
                button.setOnClickListener(new View.OnClickListener() { // from class: xsna.n5l0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String str5;
                        PurchaseDetailsButton purchaseDetailsButton2;
                        ButtonAction buttonAction;
                        PurchaseDetails purchaseDetails2 = PurchaseDetails.this;
                        AwayLink awayLink = (purchaseDetails2 == null || (purchaseDetailsButton2 = purchaseDetails2.e) == null || (buttonAction = purchaseDetailsButton2.c) == null) ? null : buttonAction.e;
                        qdz d = xwk.d();
                        if (awayLink == null || (str5 = awayLink.b) == null) {
                            str5 = "";
                        }
                        d.c(context, Uri.parse(str5), awayLink != null ? awayLink.c : null);
                        androidx.appcompat.app.d dVar = m;
                        if (dVar != null) {
                            dVar.dismiss();
                        }
                    }
                });
                button2.setOnClickListener(new wcd(m, 8));
            }
        }
        bwt0.p0(button, false);
        button2.setText(R.string.close);
        int i2 = h7u0.p;
        h7u0.a a2 = h7u0.b.a(context);
        a2.f = inflate;
        final androidx.appcompat.app.d m2 = a2.m();
        button.setOnClickListener(new View.OnClickListener() { // from class: xsna.n5l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str5;
                PurchaseDetailsButton purchaseDetailsButton2;
                ButtonAction buttonAction;
                PurchaseDetails purchaseDetails2 = PurchaseDetails.this;
                AwayLink awayLink = (purchaseDetails2 == null || (purchaseDetailsButton2 = purchaseDetails2.e) == null || (buttonAction = purchaseDetailsButton2.c) == null) ? null : buttonAction.e;
                qdz d = xwk.d();
                if (awayLink == null || (str5 = awayLink.b) == null) {
                    str5 = "";
                }
                d.c(context, Uri.parse(str5), awayLink != null ? awayLink.c : null);
                androidx.appcompat.app.d dVar = m2;
                if (dVar != null) {
                    dVar.dismiss();
                }
            }
        });
        button2.setOnClickListener(new wcd(m2, 8));
    }
}
