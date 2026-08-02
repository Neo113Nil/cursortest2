package xsna;

/* compiled from: ActionButtonToActionLinkMapper.kt */
/* loaded from: classes3.dex */
public final class jw {
    public static String a(gjx gjxVar) {
        wjz0 content;
        String n = (gjxVar == null || (content = gjxVar.getContent()) == null) ? null : content.a.n();
        if (n == null || n.equals("Visit") || n.equals("Install")) {
            return null;
        }
        return n;
    }
}
