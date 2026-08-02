package com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.input;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.yandex.div.core.view2.Div2View;
import defpackage.bpk;
import defpackage.dpk;
import defpackage.egk;
import defpackage.jl40;
import defpackage.qpe0;
import defpackage.rvo;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/divkit/input/InputSecureExtensionHandler;", "Ldpk;", "<init>", "()V", "Landroid/widget/EditText;", "editText", "Lzy11;", "applySecureSettings", "(Landroid/widget/EditText;)V", "clearSecureSettings", "Legk;", "div", "", "matches", "(Legk;)Z", "Lcom/yandex/div/core/view2/Div2View;", "divView", "Lrvo;", "expressionResolver", "Landroid/view/View;", "view", "bindView", "(Lcom/yandex/div/core/view2/Div2View;Lrvo;Landroid/view/View;Legk;)V", "unbindView", "preprocess", "(Legk;Lrvo;)V", "beforeBindView", "Companion", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InputSecureExtensionHandler implements dpk {
    private static final String EXTENSION_ID = "inputSecure";

    private final void applySecureSettings(EditText editText) {
        editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editText.setLongClickable(false);
        editText.setTextIsSelectable(false);
    }

    private final void clearSecureSettings(EditText editText) {
        editText.setInputType(1);
        editText.setTransformationMethod(null);
        editText.setLongClickable(true);
        editText.setTextIsSelectable(true);
        editText.setCursorVisible(true);
    }

    @Override // defpackage.dpk
    public void beforeBindView(Div2View divView, rvo expressionResolver, View view, egk div) {
    }

    @Override // defpackage.dpk
    public void bindView(Div2View divView, rvo expressionResolver, View view, egk div) {
        if (view instanceof EditText) {
            applySecureSettings((EditText) view);
        }
    }

    @Override // defpackage.dpk
    public /* bridge */ /* synthetic */ void loadMedia(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    @Override // defpackage.dpk
    public boolean matches(egk div) {
        List extensions = div.getExtensions();
        Object obj = null;
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((bpk) next).a, EXTENSION_ID)) {
                    obj = next;
                    break;
                }
            }
            obj = (bpk) obj;
        }
        return obj != null;
    }

    @Override // defpackage.dpk
    public /* bridge */ /* synthetic */ void preprocess(egk egkVar, rvo rvoVar, qpe0 qpe0Var) {
        super.preprocess(egkVar, rvoVar, qpe0Var);
    }

    @Override // defpackage.dpk
    public /* bridge */ /* synthetic */ void releaseMedia(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }

    @Override // defpackage.dpk
    public void unbindView(Div2View divView, rvo expressionResolver, View view, egk div) {
        if (view instanceof EditText) {
            clearSecureSettings((EditText) view);
        }
    }

    @Override // defpackage.dpk
    public void preprocess(egk div, rvo expressionResolver) {
    }
}
