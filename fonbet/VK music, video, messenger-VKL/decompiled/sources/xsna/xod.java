package xsna;

import com.vk.clips.sdk.shared.api.domain.HashtagParseMode;
import com.vk.clips.sdk.shared.api.domain.MentionsParseMode;

/* compiled from: ClipsDataFormatter.kt */
/* loaded from: classes17.dex */
public interface xod {

    /* compiled from: ClipsDataFormatter.kt */
    public static final class a {
        public static /* synthetic */ CharSequence a(xod xodVar, CharSequence charSequence, HashtagParseMode hashtagParseMode, boolean z, int i) {
            if ((i & 2) != 0) {
                hashtagParseMode = HashtagParseMode.DEFAULT;
            }
            MentionsParseMode mentionsParseMode = MentionsParseMode.DEFAULT;
            if ((i & 8) != 0) {
                z = true;
            }
            return xodVar.a(charSequence, hashtagParseMode, mentionsParseMode, z);
        }
    }

    CharSequence a(CharSequence charSequence, HashtagParseMode hashtagParseMode, MentionsParseMode mentionsParseMode, boolean z);

    CharSequence b(String str);

    CharSequence d(ag40 ag40Var);
}
