package xsna;

import android.content.ClipData;
import xsna.wjg0;

/* compiled from: ClipDataItemToSimpleTextTransformer.kt */
/* loaded from: classes5.dex */
public final class bqc implements dqc {
    @Override // xsna.dqc
    public final wjg0 a(ClipData.Item item) {
        return item.getText() != null ? new wjg0.b(item.getText().toString(), false) : new wjg0.b(item.getHtmlText().toString(), true);
    }

    @Override // xsna.dqc
    public final boolean b(ClipData.Item item) {
        CharSequence text = item.getText();
        boolean z = !(text == null || text.length() == 0);
        String htmlText = item.getHtmlText();
        return (!(htmlText == null || htmlText.length() == 0)) | z;
    }
}
