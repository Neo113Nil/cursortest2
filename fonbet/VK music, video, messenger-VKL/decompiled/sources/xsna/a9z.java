package xsna;

import com.vk.dto.newsfeed.Link;
import com.vk.dto.newsfeed.Links;
import com.vk.newsfeed.presentation.model.AdClickContext;

/* compiled from: LinkChooser.kt */
/* loaded from: classes14.dex */
public final class a9z {

    /* compiled from: LinkChooser.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdClickContext.values().length];
            try {
                iArr[AdClickContext.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdClickContext.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdClickContext.ICON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdClickContext.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdClickContext.DESCRIPTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdClickContext.IMAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdClickContext.FOOTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AdClickContext.BUTTON.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AdClickContext.CTA_BUTTON.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static Link a(Link link, String str, int i) {
        String str2;
        if (link != null && (str2 = link.b) != null && str2.length() > 0) {
            return link;
        }
        if ((link != null ? link.b : null) == null) {
            return new Link(str, i);
        }
        return null;
    }

    public static final Link b(Links links, String str, int i, AdClickContext adClickContext) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (links != null) {
            Link link = links.e;
            Link link2 = links.f;
            Link link3 = links.d;
            Link link4 = links.c;
            Link link5 = links.b;
            if (link5 == null || (str2 = link5.b) == null || str2.length() != 0 || link4 == null || (str3 = link4.b) == null || str3.length() != 0 || link3 == null || (str4 = link3.b) == null || str4.length() != 0 || link2 == null || (str5 = link2.b) == null || str5.length() != 0 || link == null || (str6 = link.b) == null || str6.length() != 0) {
                switch (adClickContext == null ? -1 : a.$EnumSwitchMapping$0[adClickContext.ordinal()]) {
                    case -1:
                        return new Link(str, i);
                    case 0:
                    default:
                        return null;
                    case 1:
                    case 2:
                    case 3:
                        return a(link5, str, i);
                    case 4:
                    case 5:
                        return link4;
                    case 6:
                        return a(link3, str, i);
                    case 7:
                        return a(link, str, i);
                    case 8:
                    case 9:
                        return a(link2, str, i);
                }
            }
        }
        return new Link(str, i);
    }
}
