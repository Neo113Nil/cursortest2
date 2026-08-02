package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.superapp.api.dto.identity.WebIdentityAddress;
import com.vk.superapp.api.dto.identity.WebIdentityCard;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import com.vk.superapp.api.dto.identity.WebIdentityEmail;
import com.vk.superapp.api.dto.identity.WebIdentityPhone;
import com.vkontakte.android.R;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;

/* compiled from: WebIdentityHelper.kt */
/* loaded from: classes6.dex */
public final class pgx0 {
    public static WebIdentityCard a(SharedPreferences sharedPreferences, WebIdentityCardData webIdentityCardData, String str) {
        int hashCode = str.hashCode();
        if (hashCode == -1147692044) {
            if (!str.equals(RTCStatsConstants.KEY_ADDRESS)) {
                return null;
            }
            WebIdentityAddress zb = webIdentityCardData.zb(sharedPreferences.getInt("identity_selected_address_id", 0));
            List<WebIdentityAddress> list = webIdentityCardData.d;
            return (zb != null || list.isEmpty()) ? zb : list.get(0);
        }
        if (hashCode == 96619420) {
            if (!str.equals("email")) {
                return null;
            }
            WebIdentityEmail Db = webIdentityCardData.Db(sharedPreferences.getInt("identity_selected_email_id", 0));
            List<WebIdentityEmail> list2 = webIdentityCardData.c;
            return (Db != null || list2.isEmpty()) ? Db : list2.get(0);
        }
        if (hashCode != 106642798 || !str.equals("phone")) {
            return null;
        }
        WebIdentityPhone Fb = webIdentityCardData.Fb(sharedPreferences.getInt("identity_selected_phone_id", 0));
        List<WebIdentityPhone> list3 = webIdentityCardData.b;
        return (Fb != null || list3.isEmpty()) ? Fb : list3.get(0);
    }

    public static String b(Context context, String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1147692044) {
            if (hashCode != 96619420) {
                if (hashCode == 106642798 && str.equals("phone")) {
                    return context.getString(R.string.vk_identity_phone);
                }
            } else if (str.equals("email")) {
                return context.getString(R.string.vk_identity_email);
            }
        } else if (str.equals(RTCStatsConstants.KEY_ADDRESS)) {
            return context.getString(R.string.vk_identity_address);
        }
        throw new IllegalStateException(str.concat(" not supported"));
    }
}
