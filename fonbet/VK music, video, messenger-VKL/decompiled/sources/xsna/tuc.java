package xsna;

import com.vk.clips.editor.callbacks.tracker.UndoRedoEventSubtype;
import com.vkontakte.android.R;

/* compiled from: ClipEditorHistoryItemType.kt */
/* loaded from: classes16.dex */
public final class tuc implements luc {
    public static final tuc a = new tuc();
    public static final UndoRedoEventSubtype b = UndoRedoEventSubtype.EDIT_AUDIO_OFFSET;

    @Override // xsna.luc
    public final Integer a() {
        return Integer.valueOf(R.string.clips_editor_undo_redo_music_length);
    }

    @Override // xsna.luc
    public final Integer b() {
        return Integer.valueOf(R.string.clips_editor_undo_redo_music_length);
    }

    @Override // xsna.luc
    public final UndoRedoEventSubtype c() {
        return b;
    }
}
