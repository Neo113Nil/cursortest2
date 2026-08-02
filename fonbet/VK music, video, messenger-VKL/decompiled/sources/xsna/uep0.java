package xsna;

import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Track.java */
/* loaded from: classes13.dex */
public interface uep0 extends Closeable {
    long[] B3();

    SubSampleInformationBox E3();

    List<f0h0> K();

    ArrayList L1();

    ArrayList M();

    long[] Q3();

    Map<vju, long[]> T2();

    long getDuration();

    String getHandler();

    String getName();

    SampleDescriptionBox getSampleDescriptionBox();

    hgp0 i3();

    List<SampleDependencyTypeBox.a> r2();
}
