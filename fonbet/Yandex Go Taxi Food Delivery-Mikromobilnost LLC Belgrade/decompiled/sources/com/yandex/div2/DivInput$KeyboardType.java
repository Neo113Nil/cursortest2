package com.yandex.div2;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.samsung.android.sdk.samsungpay.v2.card.IdvVerifyInfo;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.kuk;
import defpackage.tls;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/yandex/div2/DivInput$KeyboardType", "", "Lcom/yandex/div2/DivInput$KeyboardType;", "", "value", "Ljava/lang/String;", "Converter", "kuk", "SINGLE_LINE_TEXT", "MULTI_LINE_TEXT", "PHONE", "NUMBER", IdvVerifyInfo.IDV_TYPE_EMAIL, GlobalRouterActivity.URI, IDialogId.INTENT_EXTRA_OUT_PASSWORD, "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum DivInput$KeyboardType {
    SINGLE_LINE_TEXT("single_line_text"),
    MULTI_LINE_TEXT("multi_line_text"),
    PHONE("phone"),
    NUMBER("number"),
    EMAIL("email"),
    URI(LaunchBrowserActivity.KEY_URI),
    PASSWORD(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD);

    private final String value;
    public static final kuk Converter = new kuk();
    public static final tls TO_STRING = DivInput$KeyboardType$Converter$TO_STRING$1.w;
    public static final tls FROM_STRING = DivInput$KeyboardType$Converter$FROM_STRING$1.w;

    DivInput$KeyboardType(String str) {
        this.value = str;
    }
}
