package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: ContentInfoBottomSheet.kt */
/* loaded from: classes17.dex */
public final class qgj {
    /* JADX WARN: Type inference failed for: r12v1, types: [T, xsna.dw20] */
    public static void a(Context context, izs izsVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        VkModal.Mode mode = VkModal.Mode.DynamicHeight;
        sgj sgjVar = new sgj(context);
        LayoutInflater.from(context).inflate(R.layout.content_info_view, sgjVar);
        VkText vkText = (VkText) sgjVar.findViewById(R.id.content_info_bottom_sheet_text_main);
        View findViewById = sgjVar.findViewById(R.id.close_button);
        String string = context.getString(R.string.content_info_bottom_sheet_text_main_link);
        String string2 = context.getString(R.string.content_info_bottom_sheet_text_main, string);
        SpannableString spannableString = new SpannableString(string2);
        spannableString.setSpan(new rgj(sgjVar, context), drm0.K(0, 6, string2, string, false), string.length() + drm0.K(0, 6, string2, string, false), 33);
        vkText.setMovementMethod(LinkMovementMethod.getInstance());
        vkText.setText(spannableString);
        findViewById.setOnClickListener(new mn9(sgjVar, 3));
        sgjVar.setOnLegalLinkClick(izsVar);
        sgjVar.setOnCloseButtonClick(new kqc(ref$ObjectRef, 1));
        s3q0 s3q0Var = s3q0.a;
        ref$ObjectRef.element = new VkModal(mode, new b.C0791b(sgjVar, null), null, false, 24).b(context, null);
    }
}
