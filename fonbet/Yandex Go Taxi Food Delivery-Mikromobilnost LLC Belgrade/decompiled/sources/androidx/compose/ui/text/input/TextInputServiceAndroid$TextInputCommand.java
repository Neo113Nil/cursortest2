package androidx.compose.ui.text.input;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand", "", "Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "StartInput", "StopInput", "ShowKeyboard", "HideKeyboard", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextInputServiceAndroid$TextInputCommand {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TextInputServiceAndroid$TextInputCommand[] $VALUES;
    public static final TextInputServiceAndroid$TextInputCommand HideKeyboard;
    public static final TextInputServiceAndroid$TextInputCommand ShowKeyboard;
    public static final TextInputServiceAndroid$TextInputCommand StartInput;
    public static final TextInputServiceAndroid$TextInputCommand StopInput;

    static {
        TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand = new TextInputServiceAndroid$TextInputCommand("StartInput", 0);
        StartInput = textInputServiceAndroid$TextInputCommand;
        TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand2 = new TextInputServiceAndroid$TextInputCommand("StopInput", 1);
        StopInput = textInputServiceAndroid$TextInputCommand2;
        TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand3 = new TextInputServiceAndroid$TextInputCommand("ShowKeyboard", 2);
        ShowKeyboard = textInputServiceAndroid$TextInputCommand3;
        TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand4 = new TextInputServiceAndroid$TextInputCommand("HideKeyboard", 3);
        HideKeyboard = textInputServiceAndroid$TextInputCommand4;
        TextInputServiceAndroid$TextInputCommand[] textInputServiceAndroid$TextInputCommandArr = {textInputServiceAndroid$TextInputCommand, textInputServiceAndroid$TextInputCommand2, textInputServiceAndroid$TextInputCommand3, textInputServiceAndroid$TextInputCommand4};
        $VALUES = textInputServiceAndroid$TextInputCommandArr;
        $ENTRIES = kotlin.enums.a.a(textInputServiceAndroid$TextInputCommandArr);
    }

    public static TextInputServiceAndroid$TextInputCommand valueOf(String str) {
        return (TextInputServiceAndroid$TextInputCommand) Enum.valueOf(TextInputServiceAndroid$TextInputCommand.class, str);
    }

    public static TextInputServiceAndroid$TextInputCommand[] values() {
        return (TextInputServiceAndroid$TextInputCommand[]) $VALUES.clone();
    }
}
