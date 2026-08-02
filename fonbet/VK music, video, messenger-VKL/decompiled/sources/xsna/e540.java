package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import java.util.regex.Pattern;

/* compiled from: MultiFileModeFileNameProvider.java */
/* loaded from: classes8.dex */
public final class e540 implements i3a0 {
    public static final Pattern b = Pattern.compile("^[\\p{L}\\p{N}]+$");
    public final String a;

    public e540(String str) {
        this.a = str.concat(BundleUtil.UNDERLINE_TAG);
    }

    public final String a(Object obj) {
        String obj2 = obj.toString();
        if (!b.matcher(obj2).matches()) {
            throw new IllegalArgumentException(go9.b("Invalid key: ", obj2));
        }
        return this.a + obj;
    }
}
