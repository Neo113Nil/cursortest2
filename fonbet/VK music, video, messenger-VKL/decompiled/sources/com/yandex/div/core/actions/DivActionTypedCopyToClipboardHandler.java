package com.yandex.div.core.actions;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.k0;
import kotlin.NoWhenBranchMatchedException;
import xsna.oin;

/* compiled from: DivActionTypedCopyToClipboardHandler.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedCopyToClipboardHandler implements DivActionTypedHandler {
    private final ClipData getClipData(oin.a aVar, ExpressionResolver expressionResolver) {
        return new ClipData("Copied text", new String[]{"text/plain"}, new ClipData.Item(aVar.b.a.evaluate(expressionResolver)));
    }

    private final void handleCopyToClipboard(oin oinVar, Div2View div2View, ExpressionResolver expressionResolver) {
        Object systemService = div2View.getContext$div_release().getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            Assert.fail("Failed to access clipboard manager!");
        } else {
            clipboardManager.setPrimaryClip(getClipData(oinVar, expressionResolver));
        }
    }

    @Override // com.yandex.div.core.actions.DivActionTypedHandler
    public boolean handleAction(String str, k0 k0Var, Div2View div2View, ExpressionResolver expressionResolver) {
        if (!(k0Var instanceof k0.g)) {
            return false;
        }
        handleCopyToClipboard(((k0.g) k0Var).b.a, div2View, expressionResolver);
        return true;
    }

    private final ClipData getClipData(oin.b bVar, ExpressionResolver expressionResolver) {
        return new ClipData("Copied url", new String[]{"text/uri-list"}, new ClipData.Item(bVar.b.a.evaluate(expressionResolver)));
    }

    private final ClipData getClipData(oin oinVar, ExpressionResolver expressionResolver) {
        if (oinVar instanceof oin.a) {
            return getClipData((oin.a) oinVar, expressionResolver);
        }
        if (oinVar instanceof oin.b) {
            return getClipData((oin.b) oinVar, expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }
}
