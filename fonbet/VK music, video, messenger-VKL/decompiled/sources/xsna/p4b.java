package xsna;

import android.annotation.SuppressLint;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: ChannelMsgBodiesFormatter.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes2.dex */
public final class p4b {
    public static final a a = new a();
    public static final tz30 b;

    /* compiled from: ChannelMsgBodiesFormatter.kt */
    public static final class a extends ThreadLocal<SpannableStringBuilder> {
        @Override // java.lang.ThreadLocal
        public final SpannableStringBuilder initialValue() {
            return new SpannableStringBuilder();
        }
    }

    static {
        dhr0.a.getClass();
        b = new tz30(dhr0.E());
    }

    public static SpannableString a(Msg msg, ProfilesSimpleInfo profilesSimpleInfo) {
        SpannableStringBuilder spannableStringBuilder = a.get();
        spannableStringBuilder.clearSpans();
        spannableStringBuilder.clear();
        spannableStringBuilder.append((CharSequence) b.b(msg, profilesSimpleInfo, null, o25.a().c()));
        SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
        return new SpannableString(spannableStringBuilder);
    }
}
