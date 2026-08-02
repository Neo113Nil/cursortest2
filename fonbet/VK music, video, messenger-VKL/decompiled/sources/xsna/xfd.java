package xsna;

/* compiled from: ClipboardManager.kt */
@ozl
/* loaded from: classes11.dex */
public interface xfd {
    default boolean a() {
        us2 text = getText();
        return text != null && text.c.length() > 0;
    }

    us2 getText();
}
