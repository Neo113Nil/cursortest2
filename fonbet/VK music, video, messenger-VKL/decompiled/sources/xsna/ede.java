package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;

/* compiled from: ClipsGridHeaderAuthorHolder.kt */
/* loaded from: classes17.dex */
public final class ede extends RecyclerView.e0 {
    public final izs<ClipsGridHeaderEntry.Author, s3q0> l;
    public final dde m;

    /* compiled from: ClipsGridHeaderAuthorHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsGridHeaderEntry.Author.ContentType.values().length];
            try {
                iArr[ClipsGridHeaderEntry.Author.ContentType.MASK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsGridHeaderEntry.Author.ContentType.EFFECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsGridHeaderEntry.Author.ContentType.CHALLENGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipsGridHeaderEntry.Author.ContentType.COMPILATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ede(ViewGroup viewGroup, izs<? super ClipsGridHeaderEntry.Author, s3q0> izsVar) {
        super(new dde(viewGroup.getContext()));
        this.l = izsVar;
        dde ddeVar = (dde) this.itemView;
        this.m = ddeVar;
        ddeVar.setPadding(cn70.b(0), cn70.b(8), cn70.b(0), cn70.b(8));
    }
}
