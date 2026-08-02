package xsna;

import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import java.util.regex.Pattern;

/* compiled from: ImageListExt.kt */
/* loaded from: classes2.dex */
public final class xjw {
    public static final Pattern a = Pattern.compile("https://" + a0a.d + "/images/camera_(\\d+).png.*");

    public static final boolean a(ImageList imageList) {
        if (imageList.Jb()) {
            return a.matcher(((Image) j5g.Y(imageList.b)).d).matches();
        }
        return false;
    }
}
