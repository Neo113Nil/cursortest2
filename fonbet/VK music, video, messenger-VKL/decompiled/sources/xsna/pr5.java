package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.AvatarSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: AvatarImageParser.kt */
/* loaded from: classes2.dex */
public final class pr5 {
    public static final ImageList a = new ImageList(null, 1, null);

    public static final ImageList a(JSONObject jSONObject) throws VKApiIllegalResponseException {
        Set set;
        AvatarSize.Companion.getClass();
        Image m = AvatarSize.PHOTO_BASE.m(jSONObject);
        if (m != null) {
            return new ImageList(m);
        }
        set = AvatarSize.SIZES_EXTENDED_OBSOLETE;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Image m2 = ((AvatarSize) it.next()).m(jSONObject);
            if (m2 != null) {
                arrayList.add(m2);
            }
        }
        return new ImageList(new ArrayList(arrayList));
    }
}
