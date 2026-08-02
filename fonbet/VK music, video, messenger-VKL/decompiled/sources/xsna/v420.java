package xsna;

import android.text.Editable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vk.im.ui.views.RichEditText;
import io.jsonwebtoken.JwtParser;
import java.util.HashSet;
import java.util.regex.Pattern;
import xsna.o420;

/* compiled from: MentionsManager.kt */
/* loaded from: classes2.dex */
public final class v420 implements RichEditText.b {
    public static final Pattern d = Pattern.compile("((?<=(\\||\\ ))@|^@|(?<=(\\||\\ ))\\*id|^\\*id)[A-Za-z0-9А-Яa-я.-_]+?(?=\\])|(((?<=(\\||\\ ))@|^@|(?<=(\\||\\ ))\\*id|^\\*id)[A-Za-z0-9А-Яa-я.-_]{1,}(( \\(|\\()((?s:.)+?)(\\))){0,1})");
    public final RichEditText a;
    public final o420.a b;
    public final HashSet<Character> c = izi0.d(' ', ',', ';', Character.valueOf(JwtParser.SEPARATOR_CHAR), '!', '?', '-', '\n', '(', ')', '[', ']');

    /* compiled from: MentionsManager.kt */
    public static final class a {
        public final String a;
        public final int b;
        public final int c;

        public a(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }
    }

    public v420(RichEditText richEditText, o420.a aVar) {
        this.a = richEditText;
        this.b = aVar;
        richEditText.setOnKeyPreImeListener(this);
        richEditText.addTextChangedListener(new u420(this));
    }

    @Override // com.vk.im.ui.views.RichEditText.b
    public final boolean a(int i) {
        boolean z;
        o420.a aVar = this.b;
        o420 o420Var = o420.this;
        if (o420Var.d) {
            CoordinatorLayout coordinatorLayout = o420Var.e;
            if (coordinatorLayout == null) {
                coordinatorLayout = null;
            }
            z = bwt0.K(coordinatorLayout);
        } else {
            z = false;
        }
        if (!z || i != 4) {
            return false;
        }
        aVar.a();
        return true;
    }

    public final int[] b() {
        HashSet<Character> hashSet;
        RichEditText richEditText = this.a;
        int selectionStart = richEditText.getSelectionStart();
        Editable text = richEditText.getText();
        int i = selectionStart;
        while (true) {
            hashSet = this.c;
            if (i <= 0 || text == null || text.length() == 0 || hashSet.contains(Character.valueOf(text.charAt(i - 1)))) {
                break;
            }
            i--;
        }
        while (selectionStart < richEditText.length() && text != null && text.length() != 0 && !hashSet.contains(Character.valueOf(text.charAt(selectionStart)))) {
            selectionStart++;
        }
        return new int[]{i, selectionStart};
    }
}
