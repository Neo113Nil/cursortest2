package defpackage;

/* loaded from: classes2.dex */
public final class d790 extends szq {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d790(String str, int i) {
        super("webchat_page_finished", g8e.z("url", String.valueOf(str)));
        switch (i) {
            case 1:
                super("webchat_page_commit_visible", g8e.z("url", String.valueOf(str)));
                break;
            case 2:
                super("webchat_page_load_error", g8e.z("error", str));
                break;
            case 3:
                super("webchat_page_started", g8e.z("url", String.valueOf(str)));
                break;
            case 4:
                super("webchat_page_loading", g8e.z("url", str));
                break;
            default:
                break;
        }
    }
}
