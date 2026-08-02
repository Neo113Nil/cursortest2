package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.home.common.utils.PlusClickableSpan;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class hnt0 {
    public final b27 a;
    public final Context b;

    public hnt0(Context context, b27 b27Var) {
        this.a = b27Var;
        this.b = context.getApplicationContext();
    }

    public final SpannedString a(PlusAcquisitionSmartOffer plusAcquisitionSmartOffer) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String oneClickDisclaimer = plusAcquisitionSmartOffer.getLegals().getOneClickDisclaimer();
        if (oneClickDisclaimer != null) {
            if (oneClickDisclaimer.length() <= 0 || evu0.J(oneClickDisclaimer)) {
                oneClickDisclaimer = null;
            }
            if (oneClickDisclaimer != null) {
                spannableStringBuilder.append((CharSequence) oneClickDisclaimer);
                spannableStringBuilder.append((CharSequence) " ");
            }
        }
        String format = plusAcquisitionSmartOffer.getLegals().getFormat();
        List<PlusAcquisitionSmartOffer.Legals.Argument> arguments = plusAcquisitionSmartOffer.getLegals().getArguments();
        ArrayList arrayList = new ArrayList(tcc.n(arguments, 10));
        for (PlusAcquisitionSmartOffer.Legals.Argument argument : arguments) {
            String str = "{{" + argument.getKey() + "}}";
            int H = evu0.H(format, str, 0, false, 6);
            if (H == -1) {
                String page = plusAcquisitionSmartOffer.getPage();
                String place = plusAcquisitionSmartOffer.getPlace();
                int priority = plusAcquisitionSmartOffer.getPriority();
                String key = argument.getKey();
                bn bnVar = this.a.a;
                if (page == null) {
                    page = "no_value";
                }
                if (place == null) {
                    place = "no_value";
                }
                bnVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(Constants.KEY_PAGE, page);
                linkedHashMap.put("place", place);
                linkedHashMap.put("position", String.valueOf(priority));
                linkedHashMap.put("key", key);
                linkedHashMap.put("_meta", bn.a(new HashMap()));
                bnVar.b("OfferSection.Error.MissingLegalsKey", linkedHashMap);
                return null;
            }
            int length = spannableStringBuilder.length() + H;
            int length2 = argument.getValue().length() + length;
            format = cvu0.v(format, str, argument.getValue(), false);
            arrayList.add(new gnt0(length, length2, argument.getUri()));
        }
        if (format.length() == 0 || evu0.J(format)) {
            return null;
        }
        spannableStringBuilder.append((CharSequence) format);
        int color = this.b.getColor(qpg0.acquisition_sdk_semantic_link_link);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gnt0 gnt0Var = (gnt0) it.next();
            PlusClickableSpan plusClickableSpan = new PlusClickableSpan(false, new ppr0(26, this, gnt0Var));
            int i = gnt0Var.a;
            int i2 = gnt0Var.b;
            spannableStringBuilder.setSpan(plusClickableSpan, i, i2, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), gnt0Var.a, i2, 33);
        }
        return SpannedString.valueOf(spannableStringBuilder);
    }
}
