package xsna;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Path.java */
/* loaded from: classes13.dex */
public final class bq90 {
    public static final Pattern a = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");

    public static String a(ga8 ga8Var, String str) {
        yej parent = ga8Var.getParent();
        int i = 0;
        for (ga8 ga8Var2 : parent.getBoxes()) {
            if (ga8Var2.getType().equals(ga8Var.getType())) {
                if (ga8Var2 == ga8Var) {
                    break;
                }
                i++;
            }
        }
        String str2 = String.format("/%s[%d]", ga8Var.getType(), Integer.valueOf(i)) + str;
        return parent instanceof ga8 ? a((ga8) parent, str2) : str2;
    }

    public static <T extends ga8> T b(AbstractContainerBox abstractContainerBox, String str) {
        List c = c(abstractContainerBox, str, true);
        if (c.isEmpty()) {
            return null;
        }
        return (T) c.get(0);
    }

    public static <T extends ga8> List<T> c(Object obj, String str, boolean z) {
        String str2;
        if (str.startsWith(DomExceptionUtils.SEPARATOR)) {
            String substring = str.substring(1);
            while (obj instanceof ga8) {
                obj = ((ga8) obj).getParent();
            }
            str = substring;
        }
        if (str.length() == 0) {
            if (obj instanceof ga8) {
                return Collections.singletonList((ga8) obj);
            }
            throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
        }
        int i = 0;
        if (str.contains(DomExceptionUtils.SEPARATOR)) {
            str2 = str.substring(str.indexOf(47) + 1);
            str = str.substring(0, str.indexOf(47));
        } else {
            str2 = "";
        }
        Matcher matcher = a.matcher(str);
        if (!matcher.matches()) {
            throw new RuntimeException(String.valueOf(str).concat(" is invalid path."));
        }
        String group = matcher.group(1);
        if ("..".equals(group)) {
            return obj instanceof ga8 ? c(((ga8) obj).getParent(), str2, z) : Collections.EMPTY_LIST;
        }
        if (!(obj instanceof yej)) {
            return Collections.EMPTY_LIST;
        }
        int parseInt = matcher.group(2) != null ? Integer.parseInt(matcher.group(3)) : -1;
        LinkedList linkedList = new LinkedList();
        for (ga8 ga8Var : ((yej) obj).getBoxes()) {
            if (ga8Var.getType().matches(group)) {
                if (parseInt == -1 || parseInt == i) {
                    linkedList.addAll(c(ga8Var, str2, z));
                }
                i++;
            }
            if (z || parseInt >= 0) {
                if (!linkedList.isEmpty()) {
                    break;
                }
            }
        }
        return linkedList;
    }
}
