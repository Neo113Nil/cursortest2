package xsna;

import android.content.Context;
import android.widget.ProgressBar;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.iya;
import xsna.tlo0;

/* compiled from: ChannelDonutSupportFragment.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class aya extends FunctionReferenceImpl implements izs<iya.a.C3087a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(iya.a.C3087a c3087a) {
        iya.a.C3087a c3087a2 = c3087a;
        com.vk.channels.impl.donut.c cVar = (com.vk.channels.impl.donut.c) this.receiver;
        VkPlaceholder vkPlaceholder = cVar.d;
        ProgressBar progressBar = cVar.e;
        Context context = cVar.c;
        VkInputSelect vkInputSelect = cVar.g;
        VkButton vkButton = cVar.j;
        VkInputSelect vkInputSelect2 = cVar.i;
        VkFormField vkFormField = cVar.h;
        VkFormField vkFormField2 = cVar.f;
        String str = c3087a2.d;
        String str2 = c3087a2.c;
        cVar.k = true;
        if (c3087a2.a) {
            progressBar.setVisibility(0);
            vkPlaceholder.setVisibility(4);
            vkFormField2.setVisibility(4);
            vkFormField.setVisibility(4);
            vkButton.setVisibility(4);
        } else {
            progressBar.setVisibility(8);
            vkPlaceholder.setVisibility(0);
            vkFormField2.setVisibility(0);
            vkFormField.setVisibility(0);
            vkButton.setVisibility(0);
            vkInputSelect.setText(str2);
            vkInputSelect.setSelection(str2.length());
            vkInputSelect2.setText(str);
            vkInputSelect2.setSelection(str.length());
            vkFormField2.setAfterText(tlo0.b.a(c3087a2.f, context));
            vkInputSelect2.setHint(tlo0.b.a(c3087a2.e, context));
            tlo0 tlo0Var = c3087a2.g;
            if (tlo0Var != null) {
                vkFormField2.setError(tlo0Var.a(context));
                vkFormField2.setError(true);
                vkInputSelect.setError(true);
            } else {
                vkFormField2.setError(false);
                vkInputSelect.setError(false);
            }
            tlo0 tlo0Var2 = c3087a2.h;
            if (tlo0Var2 != null) {
                vkFormField.setError(tlo0Var2.a(context));
                vkFormField.setError(true);
                vkInputSelect2.setError(true);
            } else {
                vkFormField.setError(false);
                vkInputSelect2.setError(false);
            }
            vkButton.setEnabled(c3087a2.i);
            vkButton.setLoading(c3087a2.b);
        }
        cVar.k = false;
        return s3q0.a;
    }
}
