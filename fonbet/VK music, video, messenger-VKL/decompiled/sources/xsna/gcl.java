package xsna;

import android.content.Context;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.users.User;
import com.vkontakte.android.R;

/* compiled from: DefaultChatPreviewHistoryProvider.kt */
/* loaded from: classes2.dex */
public final class gcl {
    public static final String c;
    public final a1w a;
    public final User b;

    static {
        StringBuilder sb = new StringBuilder("\n                                {\n                                    \"sticker_id\":%1$s,\n                                    \"is_allowed\":true,\n                                    \"images\":[\n                                        {\"url\":\"https://");
        sb.append(a0a.d);
        sb.append("/sticker/1-%1$s-64\",\"width\":64,\"height\":64},\n                                        {\"url\":\"https://");
        sb.append(a0a.d);
        sb.append("/sticker/1-%1$s-128\",\"width\":128,\"height\":128},\n                                        {\"url\":\"https://");
        sb.append(a0a.d);
        sb.append("/sticker/1-%1$s-256\",\"width\":256,\"height\":256},\n                                        {\"url\":\"https://");
        sb.append(a0a.d);
        sb.append("/sticker/1-%1$s-352\",\"width\":352,\"height\":352}\n                                    ],\n                                    \"images_with_background\":[\n                                        {\"url\":\"https://");
        sb.append(a0a.d);
        sb.append("/sticker/1-%1$s-64b\",\"width\":64,\"height\":64},\n                                        {\"url\":\"https://");
        sb.append(a0a.d);
        sb.append("/sticker/1-%1$s-128b\",\"width\":128,\"height\":128},\n                                        {\"url\":\"https://");
        sb.append(a0a.d);
        sb.append("/sticker/1-%1$s-256b\",\"width\":256,\"height\":256},\n                                        {\"url\":\"https://");
        c = i5s.a(sb, a0a.d, "/sticker/1-%1$s-352b\",\"width\":352,\"height\":352}\n                                    ]\n                                }\n                                ");
    }

    public gcl(a1w a1wVar) {
        this.a = a1wVar;
        ImageList imageList = new ImageList(new Image(meq0.c(R.drawable.vkm_avatar_liza).toString()));
        UserSex userSex = UserSex.MALE;
        Context context = e43.a;
        String string = (context == null ? null : context).getString(R.string.vkim_fake_account_name_acc);
        Context context2 = e43.a;
        this.b = new User(2147483647L, 2147483647L, null, null, "id2147483647", userSex, imageList, false, false, null, false, false, null, (context2 != null ? context2 : null).getString(R.string.vkim_fake_account_name_nom), null, string, null, null, null, null, null, false, false, false, 0, null, false, false, false, false, null, null, null, null, null, null, null, null, null, false, false, false, null, false, -16818676, 4095, null);
    }
}
