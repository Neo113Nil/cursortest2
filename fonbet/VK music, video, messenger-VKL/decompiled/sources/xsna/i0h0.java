package xsna;

import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import java.util.AbstractList;

/* compiled from: SampleList.java */
/* loaded from: classes12.dex */
public final class i0h0 extends AbstractList<f0h0> {
    public final AbstractList b;

    public i0h0(TrackBox trackBox, etx... etxVarArr) {
        yej parent = ((ga8) trackBox.getParent()).getParent();
        if (!trackBox.getParent().getBoxes(MovieExtendsBox.class).isEmpty()) {
            this.b = new oes(trackBox.getTrackHeaderBox().getTrackId(), parent, etxVarArr);
        } else {
            if (etxVarArr.length > 0) {
                throw new RuntimeException("The TrackBox comes from a standard MP4 file. Only use the additionalFragments param if you are dealing with ( fragmented MP4 files AND additional fragments in standalone files )");
            }
            this.b = new yil(trackBox.getTrackHeaderBox().getTrackId(), parent);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (f0h0) this.b.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }
}
