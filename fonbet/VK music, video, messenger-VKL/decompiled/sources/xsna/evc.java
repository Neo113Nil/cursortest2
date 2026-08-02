package xsna;

import com.vk.clips.editor.callbacks.tracker.UndoRedoEventSubtype;
import com.vkontakte.android.R;

/* compiled from: ClipEditorHistoryItemType.kt */
/* loaded from: classes16.dex */
public final class evc implements luc {
    public static final evc a = new evc();
    public static final UndoRedoEventSubtype b = UndoRedoEventSubtype.VOICEOVER;

    @Override // xsna.luc
    public final Integer a() {
        return Integer.valueOf(R.string.clips_editor_undo_redo_voice_over_added);
    }

    @Override // xsna.luc
    public final Integer b() {
        return Integer.valueOf(R.string.clips_editor_undo_redo_voice_over_deleted);
    }

    @Override // xsna.luc
    public final UndoRedoEventSubtype c() {
        return b;
    }
}
