package com.yandex.messaging.input;

import android.R;
import android.app.Activity;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.ScrollingMovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.RelativeSizeSpan;
import android.text.style.URLSpan;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.emoji2.text.EmojiSpan;
import com.yandex.messaging.internal.view.chat.input.InputMentionSpan;
import defpackage.a3r0;
import defpackage.cun;
import defpackage.dmt0;
import defpackage.e4c;
import defpackage.e9h0;
import defpackage.ftn;
import defpackage.fx00;
import defpackage.fxa1;
import defpackage.g8a1;
import defpackage.jl40;
import defpackage.jng0;
import defpackage.lqo;
import defpackage.lvh0;
import defpackage.mp11;
import defpackage.ny61;
import defpackage.o9s;
import defpackage.olh0;
import defpackage.oyr;
import defpackage.p9s;
import defpackage.rv10;
import defpackage.rza;
import defpackage.tls;
import defpackage.tz10;
import defpackage.w0i0;
import defpackage.yhc;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b \u0010!JK\u0010*\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"2\u001e\u0010&\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000f0$2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000f0'¢\u0006\u0004\b*\u0010+J#\u00101\u001a\u0002002\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u0002002\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b3\u00102J\u001f\u00105\u001a\u0002002\u0006\u0010-\u001a\u00020,2\u0006\u00104\u001a\u00020\fH\u0016¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b7\u00108J\u0015\u0010;\u001a\u00020\u000f2\u0006\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010=R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010@R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010AR\"\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u000f0'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010B¨\u0006C"}, d2 = {"Lcom/yandex/messaging/input/MessageSelectionActionModeCallback;", "Landroid/view/ActionMode$Callback;", "Landroid/app/Activity;", "activity", "Lmp11;", "typefaceProvider", "La3r0;", "setFormattingHelper", "Llqo;", "experimentConfig", "<init>", "(Landroid/app/Activity;Lmp11;La3r0;Llqo;)V", "Landroid/view/MenuItem;", "Lp9s;", "type", "Lzy11;", "setTextStyle", "(Landroid/view/MenuItem;Lp9s;)V", "format", "", "start", "end", "setFormatting", "(Lp9s;II)V", "showAddLinkDialog", "()V", "Landroid/view/View;", "customDialogView", "Landroidx/appcompat/app/AlertDialog;", "alertDialog", "setupDialogViews", "(Landroid/view/View;Landroidx/appcompat/app/AlertDialog;)V", "showDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "Landroid/widget/EditText;", "input", "Lkotlin/Function3;", "", "mentionAction", "Lkotlin/Function1;", "", "linkPreviewAction", "init", "(Landroid/widget/EditText;Lzls;Ltls;)V", "Landroid/view/ActionMode;", "mode", "Landroid/view/Menu;", "menu", "", "onCreateActionMode", "(Landroid/view/ActionMode;Landroid/view/Menu;)Z", "onPrepareActionMode", "item", "onActionItemClicked", "(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z", "onDestroyActionMode", "(Landroid/view/ActionMode;)V", "Landroid/text/SpannableStringBuilder;", "text", "setLinkStyles", "(Landroid/text/SpannableStringBuilder;)V", "Landroid/app/Activity;", "Lmp11;", "La3r0;", "Llqo;", "Landroid/widget/EditText;", "Ltls;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessageSelectionActionModeCallback implements ActionMode.Callback {
    public static final int $stable = 8;
    private final Activity activity;
    private final lqo experimentConfig;
    private EditText input;
    private tls linkPreviewAction;
    private final a3r0 setFormattingHelper;
    private final mp11 typefaceProvider;

    public MessageSelectionActionModeCallback(Activity activity, mp11 mp11Var, a3r0 a3r0Var, lqo lqoVar) {
        this.activity = activity;
        this.typefaceProvider = mp11Var;
        this.setFormattingHelper = a3r0Var;
        this.experimentConfig = lqoVar;
    }

    public static /* synthetic */ void init$default(MessageSelectionActionModeCallback messageSelectionActionModeCallback, EditText editText, zls zlsVar, tls tlsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            tlsVar = new rv10(3);
        }
        messageSelectionActionModeCallback.init(editText, zlsVar, tlsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 init$lambda$0(CharSequence charSequence) {
        return zy11.a;
    }

    private final void setFormatting(p9s format, int start, int end) {
        Editable editable;
        CharacterStyle characterStyle;
        int b;
        int a;
        int b2;
        int a2;
        boolean z;
        o9s o9sVar = o9s.d;
        boolean a3 = this.experimentConfig.a(tz10.D);
        a3r0 a3r0Var = this.setFormattingHelper;
        if (!a3) {
            EditText editText = a3r0Var.g;
            if (editText == null) {
                editText = null;
            }
            SpannableStringBuilder c = a3r0Var.c(format.a, (Editable) editText.getEditableText().subSequence(start, end), format.b, format, false);
            EditText editText2 = a3r0Var.g;
            if (editText2 == null) {
                editText2 = null;
            }
            editText2.getText().replace(start, end, c);
            EditText editText3 = a3r0Var.g;
            (editText3 == null ? null : editText3).setSelection(c.length() + start);
            return;
        }
        dmt0 dmt0Var = a3r0Var.d;
        String str = format.a;
        EditText editText4 = a3r0Var.g;
        if (editText4 == null) {
            editText4 = null;
        }
        Editable editableText = editText4.getEditableText();
        String substring = editableText.toString().substring(start, end);
        int length = substring.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (!rza.b(substring.charAt(i2))) {
                break;
            } else {
                i2++;
            }
        }
        int length2 = substring.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i3 = length2 - 1;
                if (!rza.b(substring.charAt(length2))) {
                    break;
                } else if (i3 < 0) {
                    break;
                } else {
                    length2 = i3;
                }
            }
        }
        length2 = -1;
        Pair pair = (i2 == -1 || length2 == -1) ? new Pair(-1, -1) : new Pair(Integer.valueOf(start + i2), Integer.valueOf(length2 + start + 1));
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        if (intValue == -1 || intValue2 == -1) {
            EditText editText5 = a3r0Var.g;
            (editText5 == null ? null : editText5).setSelection(end);
            return;
        }
        Editable editable2 = (Editable) editableText.subSequence(intValue, intValue2);
        if (format.equals(o9sVar)) {
            CharSequence i4 = ftn.a().i(0, editable2.length() - 1, editable2, Integer.MAX_VALUE, 1);
            editable = editable2;
            if (i4 instanceof Spannable) {
                Spannable spannable = (Spannable) i4;
                z = !(spannable.getSpans(0, spannable.length() - 1, EmojiSpan.class).length == 0);
            } else {
                z = false;
            }
            if (z) {
                EditText editText6 = a3r0Var.g;
                (editText6 == null ? null : editText6).setSelection(end);
                return;
            }
        } else {
            editable = editable2;
        }
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) editableText.getSpans(intValue, intValue2, CharacterStyle.class);
        ArrayList arrayList = new ArrayList();
        int length3 = characterStyleArr.length;
        while (i < length3) {
            CharacterStyle[] characterStyleArr2 = characterStyleArr;
            CharacterStyle characterStyle2 = characterStyleArr2[i];
            dmt0Var.getClass();
            int i5 = length3;
            dmt0 dmt0Var2 = dmt0Var;
            if (jl40.l(dmt0.a(characterStyle2), "```")) {
                arrayList.add(characterStyle2);
            }
            i++;
            characterStyleArr = characterStyleArr2;
            length3 = i5;
            dmt0Var = dmt0Var2;
        }
        dmt0 dmt0Var3 = dmt0Var;
        if (!arrayList.isEmpty()) {
            EditText editText7 = a3r0Var.g;
            (editText7 == null ? null : editText7).setSelection(end);
            return;
        }
        CharacterStyle[] characterStyleArr3 = (CharacterStyle[]) editableText.getSpans(intValue, intValue2, CharacterStyle.class);
        int length4 = characterStyleArr3.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length4) {
                characterStyle = null;
                break;
            }
            characterStyle = characterStyleArr3[i6];
            dmt0Var3.getClass();
            if (jl40.l(dmt0.a(characterStyle), str) && editableText.getSpanStart(characterStyle) <= intValue && editableText.getSpanEnd(characterStyle) >= intValue2) {
                break;
            } else {
                i6++;
            }
        }
        if (characterStyle != null) {
            EditText editText8 = a3r0Var.g;
            (editText8 == null ? null : editText8).setSelection(end);
            return;
        }
        CharacterStyle[] characterStyleArr4 = (CharacterStyle[]) editable.getSpans(0, editable.length(), CharacterStyle.class);
        ArrayList arrayList2 = new ArrayList();
        for (CharacterStyle characterStyle3 : characterStyleArr4) {
            dmt0Var3.getClass();
            if (jl40.l(dmt0.a(characterStyle3), str)) {
                arrayList2.add(characterStyle3);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            editable.removeSpan((CharacterStyle) it.next());
        }
        InputMentionSpan[] inputMentionSpanArr = (InputMentionSpan[]) editable.getSpans(intValue, intValue2, InputMentionSpan.class);
        ArrayList arrayList3 = new ArrayList(inputMentionSpanArr.length);
        for (InputMentionSpan inputMentionSpan : inputMentionSpanArr) {
            EditText editText9 = a3r0Var.g;
            if (editText9 == null) {
                editText9 = null;
            }
            arrayList3.add(Integer.valueOf(editText9.getText().getSpanStart(inputMentionSpan) - intValue));
        }
        ArrayList arrayList4 = new ArrayList(inputMentionSpanArr.length);
        for (InputMentionSpan inputMentionSpan2 : inputMentionSpanArr) {
            EditText editText10 = a3r0Var.g;
            if (editText10 == null) {
                editText10 = null;
            }
            arrayList4.add(Integer.valueOf(editText10.getText().getSpanEnd(inputMentionSpan2) - intValue));
        }
        SpannableStringBuilder c2 = a3r0Var.c(format.a, editable, format.b, format, false);
        EditText editText11 = a3r0Var.g;
        if (editText11 == null) {
            editText11 = null;
        }
        Editable text = editText11.getText();
        Object[] objArr = (CharacterStyle[]) text.getSpans(intValue, intValue2, CharacterStyle.class);
        int length5 = objArr.length;
        int i7 = 0;
        while (i7 < length5) {
            Object[] objArr2 = objArr;
            Object obj = objArr2[i7];
            int i8 = length5;
            int spanStart = text.getSpanStart(obj);
            Editable editable3 = editable;
            int spanEnd = text.getSpanEnd(obj);
            dmt0Var3.getClass();
            int i9 = i7;
            CharacterStyle clone = obj instanceof e4c ? ((e4c) obj).clone() : null;
            if (spanStart < intValue2 && spanEnd > intValue) {
                text.removeSpan(obj);
                if (spanStart < intValue && b2 < (a2 = a3r0.a((b2 = a3r0.b(spanStart, intValue, text)), intValue, text))) {
                    text.setSpan(obj, b2, a2, 33);
                }
                if (spanEnd > intValue2 && clone != null && b < (a = a3r0.a((b = a3r0.b(intValue2, spanEnd, text)), spanEnd, text))) {
                    text.setSpan(clone, b, a, 33);
                }
            }
            i7 = i9 + 1;
            objArr = objArr2;
            length5 = i8;
            editable = editable3;
        }
        Editable editable4 = editable;
        EditText editText12 = a3r0Var.g;
        if (editText12 == null) {
            editText12 = null;
        }
        editText12.getText().replace(intValue, intValue2, c2);
        int length6 = inputMentionSpanArr.length;
        for (int i10 = 0; i10 < length6; i10++) {
            zls zlsVar = a3r0Var.h;
            if (zlsVar == null) {
                zlsVar = null;
            }
            zlsVar.invoke(Integer.valueOf(((Number) arrayList3.get(i10)).intValue() + start), Integer.valueOf(((Number) arrayList4.get(i10)).intValue() + start), inputMentionSpanArr[i10].getGuid());
        }
        int i11 = format.equals(o9sVar) ? end + 1 : end;
        if (c2.length() < editable4.length()) {
            i11 = c2.length() + start;
        }
        EditText editText13 = a3r0Var.g;
        (editText13 == null ? null : editText13).setSelection(i11);
    }

    public static /* synthetic */ void setFormatting$default(MessageSelectionActionModeCallback messageSelectionActionModeCallback, p9s p9sVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            EditText editText = messageSelectionActionModeCallback.input;
            if (editText == null) {
                editText = null;
            }
            i = editText.getSelectionStart();
        }
        if ((i3 & 4) != 0) {
            EditText editText2 = messageSelectionActionModeCallback.input;
            i2 = (editText2 != null ? editText2 : null).getSelectionEnd();
        }
        messageSelectionActionModeCallback.setFormatting(p9sVar, i, i2);
    }

    private final void setTextStyle(MenuItem menuItem, p9s p9sVar) {
        CharSequence title = menuItem.getTitle();
        if (title == null) {
            return;
        }
        menuItem.setTitle(this.setFormattingHelper.c(p9sVar.a, new SpannableStringBuilder(title), p9sVar.b, p9sVar, true));
    }

    private final void setupDialogViews(View customDialogView, AlertDialog alertDialog) {
        EditText editText = this.input;
        if (editText == null) {
            editText = null;
        }
        int selectionStart = editText.getSelectionStart();
        EditText editText2 = this.input;
        int selectionEnd = (editText2 != null ? editText2 : null).getSelectionEnd();
        EditText editText3 = (EditText) customDialogView.findViewById(e9h0.link_dialog_input);
        Button button = (Button) customDialogView.findViewById(e9h0.link_dialog_add_button);
        Button button2 = (Button) customDialogView.findViewById(e9h0.link_dialog_cancel_button);
        editText3.setMovementMethod(new ScrollingMovementMethod());
        button.setOnClickListener(new cun(editText3, this, selectionStart, selectionEnd, alertDialog));
        button2.setOnClickListener(new fx00(6, alertDialog, this));
        editText3.requestFocus();
        Window window = alertDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupDialogViews$lambda$8(EditText editText, MessageSelectionActionModeCallback messageSelectionActionModeCallback, int i, int i2, AlertDialog alertDialog, View view) {
        messageSelectionActionModeCallback.setFormatting(new o9s("[", oyr.p("](", editText.getText().toString(), Extension.C_BRAKE)), i, i2);
        tls tlsVar = messageSelectionActionModeCallback.linkPreviewAction;
        if (tlsVar == null) {
            tlsVar = null;
        }
        EditText editText2 = messageSelectionActionModeCallback.input;
        if (editText2 == null) {
            editText2 = null;
        }
        tlsVar.invoke(editText2.getText());
        alertDialog.cancel();
        EditText editText3 = messageSelectionActionModeCallback.input;
        (editText3 != null ? editText3 : null).requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupDialogViews$lambda$9(AlertDialog alertDialog, MessageSelectionActionModeCallback messageSelectionActionModeCallback, View view) {
        alertDialog.cancel();
        EditText editText = messageSelectionActionModeCallback.input;
        if (editText == null) {
            editText = null;
        }
        editText.requestFocus();
    }

    private final void showAddLinkDialog() {
        View inflate = LayoutInflater.from(this.activity).inflate(olh0.msg_b_custom_link_dialog, (ViewGroup) null);
        AlertDialog create = new AlertDialog.a(this.activity, w0i0.Messaging_AlertDialog).setView(inflate).create();
        setupDialogViews(inflate, create);
        showDialog(create);
    }

    private final void showDialog(AlertDialog alertDialog) {
        alertDialog.show();
        mp11 mp11Var = this.typefaceProvider;
        g8a1.i(alertDialog, mp11Var != null ? mp11Var.a() : null);
    }

    public final void init(EditText input, zls mentionAction, tls linkPreviewAction) {
        this.input = input;
        this.linkPreviewAction = linkPreviewAction;
        a3r0 a3r0Var = this.setFormattingHelper;
        a3r0Var.g = input;
        a3r0Var.h = mentionAction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
        int b;
        int a;
        int b2;
        int a2;
        int itemId = item.getItemId();
        if (itemId == e9h0.menu_make_text_bold) {
            setFormatting$default(this, o9s.c, 0, 0, 6, null);
            return false;
        }
        if (itemId == e9h0.menu_make_text_italic) {
            setFormatting$default(this, o9s.e, 0, 0, 6, null);
            return false;
        }
        if (itemId == e9h0.menu_make_text_underline) {
            setFormatting$default(this, o9s.h, 0, 0, 6, null);
            return false;
        }
        if (itemId == e9h0.menu_make_text_strikethrough) {
            setFormatting$default(this, o9s.g, 0, 0, 6, null);
            return false;
        }
        if (itemId == e9h0.menu_make_text_code) {
            setFormatting$default(this, o9s.f, 0, 0, 6, null);
            return false;
        }
        if (itemId == e9h0.menu_make_code_block) {
            setFormatting$default(this, o9s.d, 0, 0, 6, null);
            return false;
        }
        if (itemId == e9h0.menu_make_link) {
            showAddLinkDialog();
            return false;
        }
        if (itemId == e9h0.menu_regular) {
            a3r0 a3r0Var = this.setFormattingHelper;
            EditText editText = a3r0Var.g;
            dmt0 dmt0Var = a3r0Var.d;
            if (editText == null) {
                editText = null;
            }
            Editable text = editText.getText();
            EditText editText2 = a3r0Var.g;
            if (editText2 == null) {
                editText2 = null;
            }
            int selectionStart = editText2.getSelectionStart();
            EditText editText3 = a3r0Var.g;
            if (editText3 == null) {
                editText3 = null;
            }
            int selectionEnd = editText3.getSelectionEnd();
            for (RelativeSizeSpan relativeSizeSpan : (CharacterStyle[]) text.getSpans(selectionStart, selectionEnd, CharacterStyle.class)) {
                dmt0Var.getClass();
                String a3 = dmt0.a(relativeSizeSpan);
                if (a3 != null || (relativeSizeSpan instanceof URLSpan)) {
                    if (jl40.l(a3, "```")) {
                        text.removeSpan(relativeSizeSpan);
                    } else {
                        int spanStart = text.getSpanStart(relativeSizeSpan);
                        int spanEnd = text.getSpanEnd(relativeSizeSpan);
                        dmt0Var.getClass();
                        Object clone = relativeSizeSpan instanceof e4c ? ((e4c) relativeSizeSpan).clone() : null;
                        if (spanStart < selectionEnd && spanEnd > selectionStart) {
                            text.removeSpan(relativeSizeSpan);
                            if (spanStart < selectionStart && b2 < (a2 = a3r0.a((b2 = a3r0.b(spanStart, selectionStart, text)), selectionStart, text))) {
                                text.setSpan(relativeSizeSpan, b2, a2, 33);
                            }
                            if (spanEnd > selectionEnd && clone != null && b < (a = a3r0.a((b = a3r0.b(selectionEnd, spanEnd, text)), spanEnd, text))) {
                                text.setSpan(clone, b, a, 33);
                            }
                        }
                    }
                }
            }
            EditText editText4 = a3r0Var.g;
            EditText editText5 = editText4;
            if (editText4 == null) {
                editText5 = null;
            }
            editText5.setText(text);
            EditText editText6 = a3r0Var.g;
            (editText6 != null ? editText6 : null).setSelection(selectionEnd);
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
        MenuItem findItem;
        MenuItem findItem2;
        MenuItem findItem3;
        MenuItem findItem4;
        MenuItem findItem5;
        MenuItem findItem6;
        MenuItem findItem7;
        MenuItem findItem8;
        MenuItem findItem9;
        MenuItem findItem10;
        MenuItem findItem11;
        MenuItem findItem12;
        MenuInflater menuInflater = mode != null ? mode.getMenuInflater() : null;
        if (menuInflater != null) {
            menuInflater.inflate(lvh0.edit_text_context_menu, menu);
        }
        if (menu != null && (findItem12 = menu.findItem(R.id.shareText)) != null) {
            findItem12.setShowAsAction(0);
        }
        if (menu != null && (findItem11 = menu.findItem(R.id.cut)) != null) {
            findItem11.setShowAsAction(2);
        }
        if (menu != null && (findItem10 = menu.findItem(R.id.copy)) != null) {
            findItem10.setShowAsAction(2);
        }
        if (menu != null && (findItem9 = menu.findItem(R.id.paste)) != null) {
            findItem9.setShowAsAction(1);
        }
        if (menu != null && (findItem8 = menu.findItem(e9h0.menu_make_text_bold)) != null) {
            findItem8.setShowAsAction(0);
            setTextStyle(findItem8, o9s.c);
        }
        if (menu != null && (findItem7 = menu.findItem(e9h0.menu_make_text_italic)) != null) {
            findItem7.setShowAsAction(0);
            setTextStyle(findItem7, o9s.e);
        }
        if (menu != null && (findItem6 = menu.findItem(e9h0.menu_make_text_underline)) != null) {
            findItem6.setVisible(this.experimentConfig.a(tz10.D));
            findItem6.setShowAsAction(0);
            setTextStyle(findItem6, o9s.h);
        }
        if (menu != null && (findItem5 = menu.findItem(e9h0.menu_make_text_strikethrough)) != null) {
            findItem5.setVisible(this.experimentConfig.a(tz10.D));
            findItem5.setShowAsAction(0);
            setTextStyle(findItem5, o9s.g);
        }
        if (menu != null && (findItem4 = menu.findItem(e9h0.menu_make_link)) != null) {
            findItem4.setShowAsAction(0);
        }
        if (menu != null && (findItem3 = menu.findItem(e9h0.menu_regular)) != null) {
            findItem3.setVisible(this.experimentConfig.a(tz10.D));
            findItem3.setShowAsAction(0);
        }
        if (menu != null && (findItem2 = menu.findItem(e9h0.menu_make_text_code)) != null) {
            findItem2.setShowAsAction(0);
            setTextStyle(findItem2, o9s.f);
        }
        if (menu != null && (findItem = menu.findItem(e9h0.menu_make_code_block)) != null) {
            findItem.setVisible(this.experimentConfig.a(tz10.D));
            findItem.setShowAsAction(0);
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode mode) {
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
        return false;
    }

    public final void setLinkStyles(SpannableStringBuilder text) {
        a3r0 a3r0Var = this.setFormattingHelper;
        a3r0Var.getClass();
        Object[] spans = text.getSpans(0, text.length(), yhc.class);
        if (spans.length <= 0) {
            return;
        }
        if (spans[0] != null) {
            ny61.u();
        } else {
            fxa1.c(jng0.messagingOutgoingLinkColor, a3r0Var.a);
            throw null;
        }
    }

    public /* synthetic */ MessageSelectionActionModeCallback(Activity activity, mp11 mp11Var, a3r0 a3r0Var, lqo lqoVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, (i & 2) != 0 ? null : mp11Var, a3r0Var, lqoVar);
    }
}
