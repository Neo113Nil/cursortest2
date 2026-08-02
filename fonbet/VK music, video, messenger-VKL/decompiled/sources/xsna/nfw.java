package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.im.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ImageApiParser.java */
@Deprecated
/* loaded from: classes2.dex */
public final class nfw {
    public static final Pattern a = Pattern.compile("photo_(\\d+)(_orig)?");
    public static final Pattern b = Pattern.compile("thumb_(\\d+)(_orig)?");

    public static ArrayList<Image> a(JSONObject jSONObject, double d) throws VKApiIllegalResponseException {
        try {
            ArrayList<Image> arrayList = new ArrayList<>();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Matcher matcher = a.matcher(next);
                if (matcher.matches() && matcher.groupCount() == 2) {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    arrayList.add(new Image(parseInt, (int) Math.round(parseInt / d), jSONObject.getString(next), false));
                }
            }
            arrayList.trimToSize();
            return arrayList;
        } catch (NumberFormatException | JSONException e) {
            throw new VKApiIllegalResponseException("Unable to parse imageList", e);
        }
    }
}
