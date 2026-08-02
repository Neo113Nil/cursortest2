package xsna;

import android.text.TextUtils;

/* compiled from: AccountSetPrivacy.java */
/* loaded from: classes14.dex */
public final class hs extends xsg0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(String str, String str2, int i) {
        super("account.setPrivacy");
        switch (i) {
            case 1:
                super("newsfeed.banTagsBlock");
                if (!TextUtils.isEmpty(str)) {
                    K("ref", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    K("track_code", str2);
                    break;
                }
                break;
            default:
                K("key", str);
                K("value", str2);
                break;
        }
    }
}
