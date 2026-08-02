package xsna;

import com.vk.api.generated.audioBooks.dto.AudioBooksChapterProgressStatusDto;

/* compiled from: AudioBooksChapterDtoToAudioBookChaptersMapper.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class al4 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[AudioBooksChapterProgressStatusDto.values().length];
        try {
            iArr[AudioBooksChapterProgressStatusDto.UNREAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AudioBooksChapterProgressStatusDto.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
