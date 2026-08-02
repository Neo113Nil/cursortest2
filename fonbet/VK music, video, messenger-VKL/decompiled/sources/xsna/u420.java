package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.ui.views.RichEditText;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import xsna.v420;

/* compiled from: MentionsManager.kt */
/* loaded from: classes2.dex */
public final class u420 implements TextWatcher {
    public final /* synthetic */ v420 b;

    public u420(v420 v420Var) {
        this.b = v420Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        v420 v420Var = this.b;
        int[] b = v420Var.b();
        int i = 0;
        int i2 = b[0];
        int i3 = b[1];
        RichEditText richEditText = v420Var.a;
        Editable text = richEditText.getText();
        if (i3 <= i2 || text == null || text.length() == 0) {
            str = "";
        } else {
            char[] cArr = new char[i3 - i2];
            text.getChars(i2, i3, cArr, 0);
            str = new String(cArr);
        }
        owi.a("mention_debounce", 300L, new com.vk.catalog2.common.ui.holders.a(17, str, v420Var));
        ohl[] ohlVarArr = (ohl[]) richEditText.getEditableText().getSpans(0, richEditText.getEditableText().length(), ohl.class);
        while (i < ohlVarArr.length) {
            int i4 = i + 1;
            try {
                richEditText.getEditableText().removeSpan(ohlVarArr[i]);
                i = i4;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
        Matcher matcher = v420.d.matcher(richEditText.getEditableText());
        LinkedList<v420.a> linkedList = new LinkedList();
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            linkedList.add(new v420.a(richEditText.getEditableText().subSequence(start, end).toString(), start, end));
        }
        for (v420.a aVar : linkedList) {
            int i5 = aVar.b;
            int i6 = aVar.c;
            String str2 = aVar.a;
            Editable editableText = richEditText.getEditableText();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            editableText.setSpan(new j420(new x120(Peer.Unknown.e, str2, str2, 8)), i5, i6, 33);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
