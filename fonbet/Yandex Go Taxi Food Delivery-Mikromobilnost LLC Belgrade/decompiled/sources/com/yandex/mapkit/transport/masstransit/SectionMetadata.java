package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class SectionMetadata implements Serializable {
    private SectionData data;
    private boolean data__is_initialized;
    private TravelEstimation estimation;
    private boolean estimation__is_initialized;
    private int legIndex;
    private boolean legIndex__is_initialized;
    private NativeObject nativeObject;
    private List<SectionPaymentOption> paymentOptions;
    private boolean paymentOptions__is_initialized;
    private Weight weight;
    private boolean weight__is_initialized;

    public static class SectionData implements Serializable {
        private Fitness fitness;
        private Taxi taxi;
        private Transfer transfer;
        private List<Transport> transports;
        private Wait wait;

        public static SectionData fromFitness(Fitness fitness) {
            if (fitness == null) {
                ny61.g("Variant value \"fitness\" cannot be null");
                return null;
            }
            SectionData sectionData = new SectionData();
            sectionData.fitness = fitness;
            return sectionData;
        }

        public static SectionData fromTaxi(Taxi taxi) {
            if (taxi == null) {
                ny61.g("Variant value \"taxi\" cannot be null");
                return null;
            }
            SectionData sectionData = new SectionData();
            sectionData.taxi = taxi;
            return sectionData;
        }

        public static SectionData fromTransfer(Transfer transfer) {
            if (transfer == null) {
                ny61.g("Variant value \"transfer\" cannot be null");
                return null;
            }
            SectionData sectionData = new SectionData();
            sectionData.transfer = transfer;
            return sectionData;
        }

        public static SectionData fromTransports(List<Transport> list) {
            if (list == null) {
                ny61.g("Variant value \"transports\" cannot be null");
                return null;
            }
            SectionData sectionData = new SectionData();
            sectionData.transports = list;
            return sectionData;
        }

        public static SectionData fromWait(Wait wait) {
            if (wait == null) {
                ny61.g("Variant value \"wait\" cannot be null");
                return null;
            }
            SectionData sectionData = new SectionData();
            sectionData.wait = wait;
            return sectionData;
        }

        public Fitness getFitness() {
            return this.fitness;
        }

        public Taxi getTaxi() {
            return this.taxi;
        }

        public Transfer getTransfer() {
            return this.transfer;
        }

        public List<Transport> getTransports() {
            return this.transports;
        }

        public Wait getWait() {
            return this.wait;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.wait = (Wait) archive.add((Archive) this.wait, true, (Class<Archive>) Wait.class);
            this.fitness = (Fitness) archive.add((Archive) this.fitness, true, (Class<Archive>) Fitness.class);
            this.transfer = (Transfer) archive.add((Archive) this.transfer, true, (Class<Archive>) Transfer.class);
            this.taxi = (Taxi) archive.add((Archive) this.taxi, true, (Class<Archive>) Taxi.class);
            this.transports = nzs.e(Transport.class, archive, this.transports, true);
        }
    }

    public SectionMetadata(Weight weight, SectionData sectionData, TravelEstimation travelEstimation, int i, List<SectionPaymentOption> list) {
        this.weight__is_initialized = false;
        this.data__is_initialized = false;
        this.estimation__is_initialized = false;
        this.legIndex__is_initialized = false;
        this.paymentOptions__is_initialized = false;
        if (weight == null) {
            ny61.g("Required field \"weight\" cannot be null");
            throw null;
        }
        if (sectionData == null) {
            ny61.g("Required field \"data\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"paymentOptions\" cannot be null");
            throw null;
        }
        this.nativeObject = init(weight, sectionData, travelEstimation, i, list);
        this.weight = weight;
        this.weight__is_initialized = true;
        this.data = sectionData;
        this.data__is_initialized = true;
        this.estimation = travelEstimation;
        this.estimation__is_initialized = true;
        this.legIndex = i;
        this.legIndex__is_initialized = true;
        this.paymentOptions = list;
        this.paymentOptions__is_initialized = true;
    }

    private native SectionData getData__Native();

    private native TravelEstimation getEstimation__Native();

    private native int getLegIndex__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::transport::masstransit::SectionMetadata";
    }

    private native List<SectionPaymentOption> getPaymentOptions__Native();

    private native Weight getWeight__Native();

    private native NativeObject init(Weight weight, SectionData sectionData, TravelEstimation travelEstimation, int i, List<SectionPaymentOption> list);

    public synchronized SectionData getData() {
        try {
            if (!this.data__is_initialized) {
                this.data = getData__Native();
                this.data__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.data;
    }

    public synchronized TravelEstimation getEstimation() {
        try {
            if (!this.estimation__is_initialized) {
                this.estimation = getEstimation__Native();
                this.estimation__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.estimation;
    }

    public synchronized int getLegIndex() {
        try {
            if (!this.legIndex__is_initialized) {
                this.legIndex = getLegIndex__Native();
                this.legIndex__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.legIndex;
    }

    public synchronized List<SectionPaymentOption> getPaymentOptions() {
        try {
            if (!this.paymentOptions__is_initialized) {
                this.paymentOptions = getPaymentOptions__Native();
                this.paymentOptions__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.paymentOptions;
    }

    public synchronized Weight getWeight() {
        try {
            if (!this.weight__is_initialized) {
                this.weight = getWeight__Native();
                this.weight__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.weight;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getWeight(), false, (Class<Archive>) Weight.class);
            archive.add((Archive) getData(), false, (Class<Archive>) SectionData.class);
            archive.add((Archive) getEstimation(), true, (Class<Archive>) TravelEstimation.class);
            archive.add(getLegIndex());
            nzs.m(SectionPaymentOption.class, archive, getPaymentOptions(), false);
            return;
        }
        this.weight = (Weight) archive.add((Archive) this.weight, false, (Class<Archive>) Weight.class);
        this.weight__is_initialized = true;
        this.data = (SectionData) archive.add((Archive) this.data, false, (Class<Archive>) SectionData.class);
        this.data__is_initialized = true;
        this.estimation = (TravelEstimation) archive.add((Archive) this.estimation, true, (Class<Archive>) TravelEstimation.class);
        this.estimation__is_initialized = true;
        this.legIndex = archive.add(this.legIndex);
        this.legIndex__is_initialized = true;
        List<SectionPaymentOption> e = nzs.e(SectionPaymentOption.class, archive, this.paymentOptions, false);
        this.paymentOptions = e;
        this.paymentOptions__is_initialized = true;
        this.nativeObject = init(this.weight, this.data, this.estimation, this.legIndex, e);
    }

    public SectionMetadata() {
        this.weight__is_initialized = false;
        this.data__is_initialized = false;
        this.estimation__is_initialized = false;
        this.legIndex__is_initialized = false;
        this.paymentOptions__is_initialized = false;
    }

    private SectionMetadata(NativeObject nativeObject) {
        this.weight__is_initialized = false;
        this.data__is_initialized = false;
        this.estimation__is_initialized = false;
        this.legIndex__is_initialized = false;
        this.paymentOptions__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
