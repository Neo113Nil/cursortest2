package xsna;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.vk.dto.common.ClipStatStoryData;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: ClipsStatDelegate.kt */
/* loaded from: classes16.dex */
public final class t4f {
    public final v76 a;
    public final ClipStatStoryData b;
    public final u440 c;

    /* compiled from: ClipsStatDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipStatStoryData.Type.values().length];
            try {
                iArr[ClipStatStoryData.Type.Views.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipStatStoryData.Type.Likes.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public t4f(v76 v76Var, ClipStatStoryData clipStatStoryData, u440 u440Var) {
        this.a = v76Var;
        this.b = clipStatStoryData;
        this.c = u440Var;
    }

    public static ArrayList b(String str, char c) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i == str.length() || str.charAt(i) == c) {
                    arrayList.add(str.subSequence(i2, i).toString());
                    i2 = i + 1;
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    public final SpannableStringBuilder a(String str) {
        try {
            ArrayList b = b(str, '[');
            String str2 = (String) b.get(0);
            ArrayList b2 = b((String) b.get(1), ']');
            String str3 = (String) b2.get(0);
            String str4 = (String) b2.get(1);
            SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) str2);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.a.getRequireContext().getColor(R.color.vk_azure_A100));
            int length = append.length();
            append.append((CharSequence) str3);
            append.setSpan(foregroundColorSpan, length, append.length(), 17);
            return append.append((CharSequence) str4);
        } catch (IndexOutOfBoundsException unused) {
            L.i(new IllegalStateException("Wrong string resource came up"));
            return new SpannableStringBuilder().append((CharSequence) str);
        }
    }
}
